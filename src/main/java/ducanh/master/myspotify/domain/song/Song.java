package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.BaseEntity;
import ducanh.master.myspotify.domain.artist.Artist;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Song extends BaseEntity {
    @Column(name = "title")
    String title;

    @Column(name = "date_release")
    LocalDate date;

    @Column(name = "genre")
    String genre;

    @Column(name = "link")
    String link;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    Artist artist;
}
