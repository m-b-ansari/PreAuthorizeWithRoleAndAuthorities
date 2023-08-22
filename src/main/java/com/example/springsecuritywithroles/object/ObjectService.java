package com.example.springsecuritywithroles.object;

import com.example.springsecuritywithroles.model.Object;
import com.example.springsecuritywithroles.object.ObjectRepository;
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
