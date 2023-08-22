package com.example.springsecuritywithroles.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "rle")
@Setter
@Getter
public class Role implements Serializable {
    @Id
    @Column
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @Column
    private String value;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private User user;
}
