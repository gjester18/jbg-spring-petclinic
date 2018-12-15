package guru.springframework.jbgpetclinic.controllers.bootstrap;

import guru.springframework.jbgpetclinic.model.Owner;
import guru.springframework.jbgpetclinic.model.Pet;
import guru.springframework.jbgpetclinic.model.PetType;
import guru.springframework.jbgpetclinic.model.Vet;
import guru.springframework.jbgpetclinic.services.OwnerService;
import guru.springframework.jbgpetclinic.services.PetTypeService;
import guru.springframework.jbgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args)  {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Jester");
        owner1.setAddress("440 tandang sora");
        owner1.setCity("Quezon City");
        owner1.setTelephone("09055417564");
        owner1.setLastName("Gutierrez");
        ownerService.save(owner1);

        Pet jesterspet = new Pet();
        jesterspet.setType(savedDogPetType);
        jesterspet.setOwner(owner1);
        jesterspet.setBirthDate(LocalDate.now());
        jesterspet.setName("Bruno");
        owner1.getPets().add(jesterspet);


        Owner owner2 = new Owner();
        owner2.setFirstName("Mother");
        owner2.setLastName("Father");
        owner2.setAddress("440 boni avenue ");
        owner2.setCity("Mandaluyong City");
        owner2.setTelephone("23234234234");
        ownerService.save(owner2);

        Pet motherPet = new Pet();
        motherPet.setType(savedCatPetType);
        motherPet.setName("Fiona");
        motherPet.setBirthDate(LocalDate.now());
        motherPet.setOwner(owner2);
        owner2.getPets().add(motherPet);

        System.out.println("Loaded Owners.......");

        Vet vet2 = new Vet();
        vet2.setFirstName("Doctor");
        vet2.setLastName("HydroFlask");
        vetService.save(vet2);


        Vet vet1 = new Vet();
        vet1.setFirstName("Doctor");
        vet1.setLastName("Quack quack");
        vetService.save(vet1);

        System.out.println("Loaded Vets...........");



    }
}
