package ducanh.master.myspotify.domain.song.request;

import ducanh.master.myspotify.domain.common.PagingReq;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongReq extends PagingReq {
    private String name;


}
