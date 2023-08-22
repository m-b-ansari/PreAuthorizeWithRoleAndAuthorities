package com.example.springsecuritywithroles.model;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table
@Setter
@Getter
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @Column
    @NotNull
    private String username;

    @Column
    @NotNull
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "user")
    private Set<Role> roles;
}
