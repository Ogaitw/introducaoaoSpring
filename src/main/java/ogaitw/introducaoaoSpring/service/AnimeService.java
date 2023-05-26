package ogaitw.introducaoaoSpring.service;

import ogaitw.introducaoaoSpring.entities.Anime;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimeService {
    //private final AnimeRepository animeRepository;
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"Goku"), new Anime(2L,"Beserker"));
    }
}
