package hackathon.vivo.ProgrammingTheater.Service;

import hackathon.vivo.ProgrammingTheater.Dao.CodeRepo;
import hackathon.vivo.ProgrammingTheater.Entity.Code;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GameService {

    @Autowired
    CodeRepo codeRepo;

    public BasicResponse start(int num){
        if (codeRepo.count() < num){
            return new BasicResponse(false, "数据不足");
        }
        List<Code> list = codeRepo.findAll();
        Collections.shuffle(list);
        Code[] codes = new Code[num];
        for (int i = 0; i < num; i ++){
            codes[i] = list.get(i);
        }
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setSuccess(true);
        basicResponse.setCodes(codes);
        return basicResponse;
    }
}
