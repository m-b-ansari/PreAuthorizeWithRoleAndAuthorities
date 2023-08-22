//package com.example.springsecuritywithroles;
//
//import com.example.springsecuritywithroles.enums.Role;
//import com.example.springsecuritywithroles.model.User;
//import com.example.springsecuritywithroles.user.UserRepository;
//import org.springframework.stereotype.Component;
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
//        User user = new User();
//        user.setUsername("moh");
//        user.setPassword("1234");
//        user.setRole(Role.WRITE);
//        repository.save(user);
//    }
//}
