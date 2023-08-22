package com.example.springsecuritywithroles.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    READ("read"),
    WRITE("write"),
    PATCH("patch"),
    DELETE("delete"),
    ADMIN("admin")
    ;

    private final String value;

}
