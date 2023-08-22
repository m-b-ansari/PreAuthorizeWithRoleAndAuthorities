package com.example.springsecuritywithroles.model;

import org.springframework.stereotype.Service;

@Service
public class ObjectService {
    private final ObjectRepository repository;

    public ObjectService(ObjectRepository repository) {
        this.repository = repository;
    }

    public Object save(Object object) {
        return repository.save(object);
    }
}
