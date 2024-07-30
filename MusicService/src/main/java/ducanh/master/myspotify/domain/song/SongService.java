package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.song.reponse.SongCreateResp;
import ducanh.master.myspotify.domain.song.reponse.SongPageResp;
import ducanh.master.myspotify.domain.song.request.SongCreateReq;
import ducanh.master.myspotify.domain.song.request.SongReq;
import lombok.SneakyThrows;

public interface SongService {

    SongPageResp search(SongReq req);

    SongCreateResp create(SongCreateReq req);
}
