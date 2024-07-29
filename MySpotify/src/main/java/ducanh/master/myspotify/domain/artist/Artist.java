package ducanh.master.myspotify.domain.artist;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.album.Album;
import ducanh.master.myspotify.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity(name = "artist")
@Table(name = "tbl_artist")
public class Artist extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "dob")
    private String dob;

    @Column(name = "age")
    private String age;

    @OneToMany(mappedBy = "artist")
    private List<Song> songs;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;
}
