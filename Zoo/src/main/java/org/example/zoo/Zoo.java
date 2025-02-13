package org.example.zoo;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class Zoo {
    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }
    public void makeAllSounds() {
        animals.forEach(Animal::makeSound);
    }
}


