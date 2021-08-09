package com.example.demo.dao;

import com.example.demo.exception.DAOException;
import org.springframework.stereotype.Repository;

@Repository
public class MyDAO {

    public void method() throws Exception {
        throw new DAOException("Dao exception");
    }
}
