package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
