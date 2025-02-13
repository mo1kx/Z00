package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal {
    @Value("${animal.monkey.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " 🐵 У-у-а-а!");
    }
}
