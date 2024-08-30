package fr.eni.devops.appdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping
    public Object hello(){
        Map<String, String> object = new HashMap<>();

        object.put("name", "Arnaud");
        object.put("email", "adubois@campus-eni.fr");
        object.put("Date", String.valueOf(LocalDate.now()));
        return object;

    }


}
