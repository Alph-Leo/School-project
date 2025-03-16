package Enum.data.repositories;

import Enum.data.models.Cohort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CohortRepository extends MongoRepository<Cohort, String> {
    Optional<Cohort> findCohortByCohortName(String cohortName);
}
