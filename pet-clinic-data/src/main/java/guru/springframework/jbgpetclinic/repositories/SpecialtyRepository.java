package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}
