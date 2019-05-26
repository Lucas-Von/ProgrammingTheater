package hackathon.vivo.ProgrammingTheater.Controller;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import hackathon.vivo.ProgrammingTheater.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping(value = "/start")
    public BasicResponse start(@RequestParam int num){
        return gameService.start(num);
    }
}
