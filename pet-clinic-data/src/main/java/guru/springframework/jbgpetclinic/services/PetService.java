package guru.springframework.jbgpetclinic.services;

import guru.springframework.jbgpetclinic.model.Pet;

import java.util.List;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    List<Pet> findAll();
}
