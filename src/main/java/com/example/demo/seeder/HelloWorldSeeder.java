package com.example.demo.seeder;

import com.example.demo.model.HelloWorldModel;
import com.example.demo.repository.HelloWorldRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class HelloWorldSeeder implements CommandLineRunner {

    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldSeeder(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        HelloWorldModel tmp = new HelloWorldModel();
        tmp.setLanguage("srp");
        tmp.setValue("Zdravo svete");
        helloWorldRepository.save(tmp);
    }
}
