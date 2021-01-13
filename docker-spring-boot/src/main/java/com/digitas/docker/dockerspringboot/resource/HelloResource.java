package com.digitas.docker.dockerspringboot.resource;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello() {
        JSONObject json = new JSONObject();
        json.put("firstname", "John");
        json.put("lastname", "Doe");
        json.put("email", "johndoe@digitas.com");

        return json.toJSONString();
    }
}
