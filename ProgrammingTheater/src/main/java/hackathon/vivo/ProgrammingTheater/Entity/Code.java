package hackathon.vivo.ProgrammingTheater.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_code")
public class Code {

    @Id
    @Column
    private String userId = "";

    @Column
    private String content = "";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Code() {
    }

    public Code(String userId, String content) {
        this.userId = userId;
        this.content = content;
    }
}
