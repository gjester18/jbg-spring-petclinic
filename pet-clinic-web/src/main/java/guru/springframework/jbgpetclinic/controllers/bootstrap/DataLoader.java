package guru.springframework.jbgpetclinic.controllers.bootstrap;

import guru.springframework.jbgpetclinic.model.Owner;
import guru.springframework.jbgpetclinic.model.Vet;
import guru.springframework.jbgpetclinic.services.OwnerService;
import guru.springframework.jbgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Jester");
        owner1.setLastName("Gutierrez");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mother");
        owner2.setLastName("Father");
        owner2.setId(2L);
        ownerService.save(owner2);

        System.out.println("Loaded Owners.......");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Doctor");
        vet2.setLastName("HydroFlask");
        vetService.save(vet2);


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Doctor");
        vet1.setLastName("Quack quack");
        vetService.save(vet1);

        System.out.println("Loaded Vets...........");



    }
}
