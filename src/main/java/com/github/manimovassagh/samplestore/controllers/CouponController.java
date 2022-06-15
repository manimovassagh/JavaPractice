package com.github.manimovassagh.samplestore.controllers;

import com.github.manimovassagh.samplestore.entities.Coupon;
import com.github.manimovassagh.samplestore.repositories.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponController {

    @Autowired
    private CouponRepository repository;



    @RequestMapping(value = "/coupons",method = RequestMethod.GET)
    public List<Coupon> getAllCoupons(){
       return repository.findAll();
    }


}
