package ducanh.master.myspotify.domain.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PagingReq {
    private int pageIndex = 1;
    private int pageSize = 20;

    /**
     * field1:asc,field2:desc
     */
    private String sort;

    public Sort getSortable() {
        try {
            if (StringUtils.hasLength(sort)) {
                String[] splits = sort.split(",");
                List<Sort.Order> orders = new ArrayList<>();
                for (String sortStr : splits) {
                    String[] values = sortStr.split(":");

                    if (values[1].equals("asc")) {
                        orders.add(Sort.Order.asc(values[0]));
                    } else {
                        orders.add(Sort.Order.desc(values[0]));
                    }
                }
                return Sort.by(orders);
            }
        } catch (Exception ignored) {
        }

        return Sort.unsorted();
    }
}
