package Enum.data.repositories;

import Enum.data.models.Program;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProgramRepository extends MongoRepository<Program, String> {

    Optional<Program> getProgramByProgramName(String programName);

}
