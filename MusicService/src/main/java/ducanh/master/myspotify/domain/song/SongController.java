package ducanh.master.myspotify.domain.song;

import ducanh.master.myspotify.domain.song.reponse.SongCreateResp;
import ducanh.master.myspotify.domain.song.reponse.SongPageResp;
import ducanh.master.myspotify.domain.song.request.SongCreateReq;
import ducanh.master.myspotify.domain.song.request.SongReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/song")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;
    @GetMapping()
    public SongPageResp search(SongReq req){
        return songService.search(req);
    }

    @PostMapping()
    public SongCreateResp create(@RequestBody SongCreateReq createReq){
        return songService.create(createReq);
    }
}
