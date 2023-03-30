package ducanh.master.myspotify.domain.playlist;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.song.Song;
import ducanh.master.myspotify.domain.user.Customer;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity(name = "playlist")
@Table(name = "tbl_playlist")
public class Playlist extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "playlist",fetch = FetchType.EAGER)
    private List<Song> songs;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
