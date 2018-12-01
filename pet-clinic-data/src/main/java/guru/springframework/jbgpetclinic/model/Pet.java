package guru.springframework.jbgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity  {

    private PetType petType;
    private LocalDate birthDate;

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
