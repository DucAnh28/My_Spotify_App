package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.common.BaseEntity;
import ducanh.master.myspotify.domain.album.Album;
import ducanh.master.myspotify.domain.artist.Artist;
import ducanh.master.myspotify.domain.playlist.Playlist;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity(name = "song")
@Getter
@Setter
@Table(name = "tbl_song")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Song extends BaseEntity {
    @Column(name = "title")
    String title;

    @Column(name = "date_release")
    LocalDate date;

    @Column(name = "genre")
    String genre;

    @Column(name = "picture")
    String picture;

    @Column(name = "link")
    String link;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    Artist artist;

    @ManyToOne
    @JoinColumn(name = "album_id")
    Album album;

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    Playlist playlist;

}
