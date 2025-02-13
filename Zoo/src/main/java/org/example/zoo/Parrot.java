package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot implements Animal {
    @Value("${animal.parrot.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " 🦜 Чирик-чирик!");
    }
}

