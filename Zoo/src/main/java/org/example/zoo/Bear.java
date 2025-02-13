package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bear implements Animal {
    @Value("${animal.bear.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " \uD83D\uDC3BPaaaaaaв!");
    }
}

