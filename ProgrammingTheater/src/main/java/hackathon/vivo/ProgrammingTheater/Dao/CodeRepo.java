package hackathon.vivo.ProgrammingTheater.Dao;

import hackathon.vivo.ProgrammingTheater.Entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepo extends JpaRepository<Code, String> {
}
