package com.example.springsecuritywithroles;

import com.example.springsecuritywithroles.model.Object;
import com.example.springsecuritywithroles.model.ObjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class Controller {
    private final ObjectService service;

    public Controller(ObjectService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public ResponseEntity<Object> save(@RequestBody Object object) {
        return new ResponseEntity<>(service.save(object), HttpStatus.CREATED);
    }
}
