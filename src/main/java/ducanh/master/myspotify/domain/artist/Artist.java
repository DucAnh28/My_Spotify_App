package ducanh.master.myspotify.domain.artist;

import ducanh.master.myspotify.domain.BaseEntity;
import ducanh.master.myspotify.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Artist extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "nationality")
    private String nationality;

    @OneToMany(mappedBy = "song")
    private List<Song> songs;
}
