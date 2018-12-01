package guru.springframework.jbgpetclinic.services;


import guru.springframework.jbgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
