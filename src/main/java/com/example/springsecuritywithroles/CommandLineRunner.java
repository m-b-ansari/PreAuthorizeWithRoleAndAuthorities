//package com.example.springsecuritywithroles;
//
//import com.example.springsecuritywithroles.enums.Role;
//import com.example.springsecuritywithroles.model.User;
//import com.example.springsecuritywithroles.user.UserRepository;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//
//@Component
//public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
//    private final UserRepository repository;
//
//    public CommandLineRunner(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        User writer = new User();
//        writer.setUsername("writer");
//        writer.setPassword("1234");
//        writer.setRole(Role.WRITE);
//        User reader = new User();
//        reader.setUsername("reader");
//        reader.setPassword("1234");
//        reader.setRole(Role.READ);
//        User patcher = new User();
//        patcher.setUsername("patcher");
//        patcher.setPassword("1234");
//        patcher.setRole(Role.PATCH);
//        User deleter = new User();
//        deleter.setUsername("deleter");
//        deleter.setPassword("1234");
//        deleter.setRole(Role.DELETE);
//        User admin = new User();
//        admin.setUsername("admin");
//        admin.setPassword("1234");
//        admin.setRole(Role.ADMIN);
//        repository.saveAll(Arrays.asList(admin, deleter, patcher, reader, writer));
//    }
//}
