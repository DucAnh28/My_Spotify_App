package ducanh.master.myspotify.domain.album;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.artist.Artist;
import ducanh.master.myspotify.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
