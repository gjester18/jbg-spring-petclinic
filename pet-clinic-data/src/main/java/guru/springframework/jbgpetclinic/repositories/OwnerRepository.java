package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long > {

}
