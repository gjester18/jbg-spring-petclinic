package guru.springframework.jbgpetclinic.repositories;

import guru.springframework.jbgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
