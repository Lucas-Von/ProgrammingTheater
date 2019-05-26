package hackathon.vivo.ProgrammingTheater.Parameter;

public class LoginParameter {

    private String id = "";

    private String psw = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public LoginParameter() {
    }

    public LoginParameter(String id, String psw) {
        this.id = id;
        this.psw = psw;
    }
}
