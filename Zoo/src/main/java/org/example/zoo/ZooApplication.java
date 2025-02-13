package org.example.zoo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooApplication implements CommandLineRunner {
    private final Zoo zoo;

    public ZooApplication(Zoo zoo) {
        this.zoo = zoo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);
    }

    @Override
    public void run(String... args) {
        zoo.makeAllSounds();
    }
}
