package ducanh.master.myspotify.domain.common;

import ducanh.master.myspotify.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonService {

    private final MapperUtil mapperUtil;

    public PageRequest getPageRequest(int pageIndex, int pageSize, String properties) {
        var index = Math.max(pageIndex, 1);
        var size = Math.min(pageSize, 10);
        var sort = Sort.by(Sort.Direction.DESC, properties);
        return PageRequest.of(index - 1, size, sort);
    }

    public <T extends PagingResp<E>, E, P> T getPageResp(Page<P> page, Class<T> targetClass, Class<E> classResp) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var pageable = page.getPageable();
        var pageNumber = pageable.getPageNumber() + 1;
        var pageSize = pageable.getPageSize();

        Constructor<T> constructor = targetClass.getConstructor(Long.class, Integer.class, Integer.class, List.class);

        if (page.isEmpty()) {
            return constructor.newInstance(
                    page.getTotalElements(),
                    pageNumber,
                    pageSize,
                    new ArrayList<>());
        }

        return constructor.newInstance(
                page.getTotalElements(),
                pageNumber,
                pageSize,
                mapperUtil.mapList(page.getContent(), classResp)
        );
    }
}
