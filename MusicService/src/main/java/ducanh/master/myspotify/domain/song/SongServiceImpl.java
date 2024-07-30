package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.common.CommonService;
import ducanh.master.myspotify.domain.song.reponse.SongCreateResp;
import ducanh.master.myspotify.domain.song.reponse.SongPageResp;
import ducanh.master.myspotify.domain.song.reponse.SongResp;
import ducanh.master.myspotify.domain.song.request.SongCreateReq;
import ducanh.master.myspotify.domain.song.request.SongReq;
import ducanh.master.myspotify.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService{
    private final SongRepository songRepository;
    private final CommonService commonService;
    private final MapperUtil mapperUtil;

    @SneakyThrows
    @Override
    public SongPageResp search(SongReq req) {
        var pageReq = commonService.getPageRequest(req.getPageIndex(), req.getPageSize(), Song_.DATE);

        var specification = SongSpecification.getByName(req.getName());

        var page = songRepository.findAll(specification, pageReq);

        return commonService.getPageResp(page, SongPageResp.class, SongResp.class);
    }

    @Override
    public SongCreateResp create(SongCreateReq req){
        Song song = new Song();
        song.setDate(LocalDate.now());
        song.setTitle(req.getTitle());
        song.setGenre(req.getGenre());
        song.setLink(req.getLink());
        song.setPicture(req.getPicture());

        return mapperUtil.getModelMapper().map(songRepository.save(song), SongCreateResp.class);
    }
}
