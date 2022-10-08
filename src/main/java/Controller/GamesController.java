package Controller;

import model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Game")
public class GamesController {
    @Autowired
    //serivicio
    @GetMapping("/all")
    @PostMapping("save")
    public List<Games> getGames(){
        return gamesService.getAll();
    }
}
