package hackathon.vivo.ProgrammingTheater.Service;

import hackathon.vivo.ProgrammingTheater.Dao.UserRepo;
import hackathon.vivo.ProgrammingTheater.Entity.User;
import hackathon.vivo.ProgrammingTheater.Response.BasicResponse;
import hackathon.vivo.ProgrammingTheater.Utils.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserRepo userRepo;

    public BasicResponse register(String userName, String password){
        if (userRepo.existsById(userName)){
            return new BasicResponse(false, "用户名已存在");
        }
        User user = new User(userName, Encrypt.encrypt(password));
        userRepo.save(user);
        return new BasicResponse(true, "");
    }

    public BasicResponse login(String userName, String password){
        if (!userRepo.existsById(userName)){
            return new BasicResponse(false, "用户不存在");
        }
        User user = userRepo.findById(userName).get();
        if (!Encrypt.encrypt(password).equals(user.getPassword())){
            return new BasicResponse(false, "密码错误");
        }
        return new BasicResponse(true, "");
    }
}
