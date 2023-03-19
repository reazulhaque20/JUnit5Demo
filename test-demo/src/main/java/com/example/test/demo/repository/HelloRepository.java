package com.example.test.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
    public String get() {
        return "Hello JUnit 5";
    }
}
