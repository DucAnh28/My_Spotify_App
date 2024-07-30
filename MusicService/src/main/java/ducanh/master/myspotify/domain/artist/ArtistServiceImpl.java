package ducanh.master.myspotify.domain.artist;

import ducanh.master.myspotify.domain.artist.reponse.ArtistCreateResp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

//    public ArtistCreateResp create()
}
