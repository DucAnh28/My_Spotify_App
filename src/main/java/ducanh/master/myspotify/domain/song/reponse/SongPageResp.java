package ducanh.master.myspotify.domain.song.reponse;

import ducanh.master.myspotify.domain.common.PagingResp;

import java.util.List;

public class SongPageResp extends PagingResp<SongResp> {
    public SongPageResp(int pageIndex, int pageSize) {
        super(pageIndex, pageSize);
    }

    public SongPageResp(long total, int pageIndex, int pageSize) {
        super(total, pageIndex, pageSize);
    }

    public SongPageResp(long total, int pageIndex, int pageSize, List<SongResp> data) {
        super(total, pageIndex, pageSize, data);
    }
}
