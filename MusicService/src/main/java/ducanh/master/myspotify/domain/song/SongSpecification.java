package ducanh.master.myspotify.domain.song;

import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class SongSpecification {
    public static Specification<Song> getByName(String name) {
        return (root, query, criteriaBuilder) -> name == null ? criteriaBuilder.and() :
                criteriaBuilder.like(criteriaBuilder.upper(root.get(Song_.TITLE)), "%" + name.toUpperCase() + "%");
    }

}
