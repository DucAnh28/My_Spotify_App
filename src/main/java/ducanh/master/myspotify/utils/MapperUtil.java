package ducanh.master.myspotify.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
@RequiredArgsConstructor
public class MapperUtil {
    private final ModelMapper modelMapper;

    public ModelMapper getModelMapper() {
        return this.modelMapper;
    }

    @SneakyThrows
    public <S, T> List<T> mapList(List<S> sources, Class<T> targetClass) {
        List<T> results = new ArrayList<>();

        for (S source : sources) {
            T targetObj = targetClass.getConstructor().newInstance();
            modelMapper.map(source, targetObj);
            results.add(targetObj);
        }

        return results;
    }

}
