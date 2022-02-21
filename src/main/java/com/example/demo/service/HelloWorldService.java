package com.example.demo.service;

import com.example.demo.model.HelloWorldModel;
import com.example.demo.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HelloWorldService {

    private HelloWorldRepository helloWorldRepository;
    @Autowired
    public HelloWorldService(HelloWorldRepository helloWorldRepository){this.helloWorldRepository = helloWorldRepository;}

    public String index()
    {
        return "Hello World";
    }

    public String getLanguage(String languageName)
    {
        HelloWorldModel tmp = helloWorldRepository.findByLanguage(languageName);
        return tmp.getValue();
    }

    public  HelloWorldModel store(HelloWorldModel model)
    {
        return helloWorldRepository.save(model);
    }

}
