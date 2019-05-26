package hackathon.vivo.ProgrammingTheater.Controller;

import hackathon.vivo.ProgrammingTheater.Parameter.CodeParameter;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import hackathon.vivo.ProgrammingTheater.Service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/code")
public class CodeController {

    @Autowired
    CodeService codeService;

    @PostMapping(value = "/setCode")
    public BasicResponse setCode(@RequestBody CodeParameter parameter){
        return codeService.setCode(parameter.getUserId(), parameter.getCode());
    }

    @PostMapping(value = "/getCode")
    public BasicResponse getCode(@RequestBody CodeParameter parameter){
        return codeService.getCode(parameter.getUserId());
    }
}
