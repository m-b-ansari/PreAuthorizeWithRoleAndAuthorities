package com.example.springsecuritywithroles.object;

import com.example.springsecuritywithroles.model.Object;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class ObjectController {
    private final ObjectService service;

    public ObjectController(ObjectService service) {
        this.service = service;
    }

//    @PreAuthorize("hasAuthority('write')")
    @PostMapping("/post")
    public ResponseEntity<Object> save(@RequestBody Object object) {
        return new ResponseEntity<>(service.save(object), HttpStatus.CREATED);
    }
}
