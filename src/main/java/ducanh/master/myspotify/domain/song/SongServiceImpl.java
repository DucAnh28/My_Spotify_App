package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.common.CommonService;
import ducanh.master.myspotify.domain.song.reponse.SongPageResp;
import ducanh.master.myspotify.domain.song.reponse.SongResp;
import ducanh.master.myspotify.domain.song.request.SongReq;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService{
    private final SongRepository songRepository;

    private final CommonService commonService;

    @SneakyThrows
    @Override
    public SongPageResp search(SongReq req) {
        var pageReq = commonService.getPageRequest(req.getPageIndex(), req.getPageSize(), Song_.DATE);

        var specification = SongSpecification.getByName(req.getName());

        var page = songRepository.findAll(specification, pageReq);

        return commonService.getPageResp(page, SongPageResp.class, SongResp.class);
    }
}
