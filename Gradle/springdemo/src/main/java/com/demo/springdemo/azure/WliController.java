package com.demo.springdemo.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wli")
public class WliController {

    @GetMapping
    public List<String> executeWli(){
        return List.of(
                "Implementing",
                "WorkLoadIdentity",
                "Soon");
    }
}
