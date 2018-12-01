package guru.springframework.jbgpetclinic.services;


import guru.springframework.jbgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

}
