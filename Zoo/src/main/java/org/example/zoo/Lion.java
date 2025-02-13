package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Lion implements Animal {
    @Value("${animal.lion.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " 🦁 Ррр!");
    }
}

