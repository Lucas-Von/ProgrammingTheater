package hackathon.vivo.ProgrammingTheater.Parameter;

public class CodeParameter {
    private String userId = "";

    private String code = "";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CodeParameter() {
    }

    public CodeParameter(String userId, String code) {
        this.userId = userId;
        this.code = code;
    }
}
