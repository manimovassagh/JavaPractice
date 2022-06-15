package com.github.manimovassagh.samplestore.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Coupon {
    @Id
    private Long id;
    private String couponCode;
}
