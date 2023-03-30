package ducanh.master.myspotify.domain.song.reponse;

import ducanh.master.myspotify.domain.album.Album;
import ducanh.master.myspotify.domain.artist.Artist;
import ducanh.master.myspotify.domain.playlist.Playlist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongResp {

    String title;

    LocalDate date;

    int year;

    String genre;

    String picture;

    String link;

    Artist artist;

    Album album;

    Playlist playlist;
}
