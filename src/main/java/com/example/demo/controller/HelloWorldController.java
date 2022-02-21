package com.example.demo.controller;

import com.example.demo.model.HelloWorldModel;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService)
    {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value = "/hello-rest")
    public String index()
    {
        return helloWorldService.index();
    }


    @GetMapping(value = "/hello")
//    @ResponseBody
    public ModelAndView getHtmlPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tmp/index");
        return modelAndView;
    }

    @GetMapping(value = "/hello/language")
    public String getLanguage(@RequestParam String languageName)
    {
        return helloWorldService.getLanguage(languageName);
    }

    @PostMapping(value = "/secure/hello")
    public HelloWorldModel store(@RequestBody HelloWorldModel model)
    {
        return helloWorldService.store(model);
    }

}
