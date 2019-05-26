package hackathon.vivo.ProgrammingTheater.Controller;


import hackathon.vivo.ProgrammingTheater.Parameter.LoginParameter;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import hackathon.vivo.ProgrammingTheater.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login")
    public BasicResponse login(@RequestBody LoginParameter parameter){
        return loginService.login(parameter.getId(), parameter.getPsw());
    }

    @PostMapping(value = "/register")
    public BasicResponse register(@RequestBody LoginParameter parameter){
        return loginService.register(parameter.getId(), parameter.getPsw());
    }

}
