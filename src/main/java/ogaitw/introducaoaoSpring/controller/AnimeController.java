package ogaitw.introducaoaoSpring.controller;

import lombok.extern.log4j.Log4j2;
import ogaitw.introducaoaoSpring.entities.Anime;
import ogaitw.introducaoaoSpring.util.DateUntil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("anime")
public class AnimeController {
    //localhost:8080/anime/list

    private DateUntil dateUntil;
    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUntil.formaLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
    return List.of(new Anime("Dbz"), new Anime("Beserker"));
    }
}
