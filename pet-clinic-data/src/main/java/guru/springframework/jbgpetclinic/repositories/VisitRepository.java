package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
