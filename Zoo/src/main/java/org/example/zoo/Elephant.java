package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Elephant implements Animal {
    @Value("${animal.elephant.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " 🐘 Труууу!");
    }
}
