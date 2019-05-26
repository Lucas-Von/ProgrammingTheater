package hackathon.vivo.ProgrammingTheater.Response;

import hackathon.vivo.ProgrammingTheater.Entity.Code;

public class BasicResponse {

    private boolean success = false;

    private String message = "";

    private Object content;

    private Code[] codes;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Code[] getCodes() {
        return codes;
    }

    public void setCodes(Code[] codes) {
        this.codes = codes;
    }

    public BasicResponse() {
    }

    public BasicResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
