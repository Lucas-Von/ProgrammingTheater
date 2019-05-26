package hackathon.vivo.ProgrammingTheater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammingTheaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammingTheaterApplication.class, args);
		System.out.println("启动成功！");
	}

}
