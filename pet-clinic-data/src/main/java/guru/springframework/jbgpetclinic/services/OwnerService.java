package guru.springframework.jbgpetclinic.services;


import guru.springframework.jbgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    List<Owner> findAll();
}
