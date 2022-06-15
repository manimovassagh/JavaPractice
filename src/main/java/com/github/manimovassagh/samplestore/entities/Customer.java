package com.github.manimovassagh.samplestore.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
