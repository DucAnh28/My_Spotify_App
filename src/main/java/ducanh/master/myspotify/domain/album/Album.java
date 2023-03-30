package ducanh.master.myspotify.domain.album;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.artist.Artist;
import ducanh.master.myspotify.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Setter
@Getter
@Entity(name = "album")
@Table(name = "tbl_artist")
public class Album extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToMany
    private List<Song> songList;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}
