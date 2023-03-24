package ducanh.master.myspotify.domain.album;

import ducanh.master.myspotify.domain.BaseEntity;
import ducanh.master.myspotify.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Setter
@Getter
@Entity(name = "album")
@Table(name = "tbl_artist")
public class Album extends BaseEntity {
    @Column(name = "album_name")
    private String name;

    @OneToMany
    private List<Song> songList;
}
