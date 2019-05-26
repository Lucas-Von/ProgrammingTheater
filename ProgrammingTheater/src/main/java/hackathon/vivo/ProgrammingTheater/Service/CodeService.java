package hackathon.vivo.ProgrammingTheater.Service;

import hackathon.vivo.ProgrammingTheater.Dao.CodeRepo;
import hackathon.vivo.ProgrammingTheater.Dao.UserRepo;
import hackathon.vivo.ProgrammingTheater.Entity.Code;
import hackathon.vivo.ProgrammingTheater.Entity.User;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CodeService {

    @Autowired
    CodeRepo codeRepo;

    @Autowired
    UserRepo userRepo;

    public BasicResponse setCode(String userId, String content){
        if (!userRepo.existsById(userId)){
            return new BasicResponse(false, "用户不存在");
        }
        Code code = new Code(userId, content);
        codeRepo.save(code);
        return new BasicResponse(true, "");
    }

    public BasicResponse getCode(String userId){
        if (!codeRepo.existsById(userId)){
            return new BasicResponse(false, "代码不存在");
        }
        Code code = codeRepo.findById(userId).get();
        return new BasicResponse(true, code.getContent());
    }
}
