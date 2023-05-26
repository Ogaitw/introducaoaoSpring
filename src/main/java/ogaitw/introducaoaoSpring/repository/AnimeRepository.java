package ogaitw.introducaoaoSpring.repository;

import ogaitw.introducaoaoSpring.entities.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
