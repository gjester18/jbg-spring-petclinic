package guru.springframework.jbgpetclinic.model;

import java.time.LocalDate;

public class Pet  {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getType() {
        return petType;
    }

    public void setType(PetType type) {
        this.petType = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
