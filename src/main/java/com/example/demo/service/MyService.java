package com.example.demo.service;

import com.example.demo.dao.MyDAO;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class MyService {

    @Autowired
    private MyDAO dao;

    public void method() throws Exception {
        System.out.println("service");
        dao.method();
    }

}
