package ducanh.master.myspotify.domain.song.reponse;

import ducanh.master.myspotify.domain.album.Album;
import ducanh.master.myspotify.domain.artist.Artist;
import ducanh.master.myspotify.domain.playlist.Playlist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongResp {

    String title;

    LocalDate date;

    String genre;

    String picture;

    String link;

    Artist artist;

    Album album;
}
