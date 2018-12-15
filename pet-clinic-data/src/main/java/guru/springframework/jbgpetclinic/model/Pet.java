package guru.springframework.jbgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity  {

    private PetType petType;
    private LocalDate birthDate;
    private Owner owner;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public PetType getType() {
        return petType;
    }

    public void setType(PetType type) {
        this.petType = type;
    }



    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
