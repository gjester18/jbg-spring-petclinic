package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
