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
    private String username = "";

    @Column
    private String script = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Code() {
    }

    public Code(String username, String script) {
        this.username = username;
        this.script = script;
    }
}
