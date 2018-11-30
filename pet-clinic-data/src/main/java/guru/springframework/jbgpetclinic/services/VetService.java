package guru.springframework.jbgpetclinic.services;


import guru.springframework.jbgpetclinic.model.Vet;

import java.util.List;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    List<Vet> findAll();

}
