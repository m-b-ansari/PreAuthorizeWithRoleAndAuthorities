package com.example.springsecuritywithroles.model;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "obj")
@Setter
@Getter
public class Object implements Serializable {
    @Id
    @Column(nullable = false)
    @NotNull
    private UUID id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Integer number;
}
