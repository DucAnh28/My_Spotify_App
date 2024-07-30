package ducanh.master.myspotify.domain.playlist;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.song.Song;
import ducanh.master.myspotify.domain.user.Customer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
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
