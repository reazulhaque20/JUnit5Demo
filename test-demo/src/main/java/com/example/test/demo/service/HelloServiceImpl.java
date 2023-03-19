package com.example.test.demo.service;

import com.example.test.demo.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;

    @Override
    public String get() {
        return helloRepository.get();
    }
}
