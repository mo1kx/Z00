package org.example.zoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake implements Animal {
    @Value("${animal.snake.name}")
    private String name;

    @Override
    public void makeSound() {
        System.out.println(name + " 🐍 Ш-ш-ш!");
    }
}

