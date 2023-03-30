package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.song.reponse.SongPageResp;
import ducanh.master.myspotify.domain.song.request.SongReq;
import lombok.SneakyThrows;

public interface SongService {
    @SneakyThrows
    SongPageResp search(SongReq req);
}
