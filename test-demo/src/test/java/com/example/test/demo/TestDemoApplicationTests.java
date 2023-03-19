package com.example.test.demo;

import com.example.test.demo.repository.HelloRepository;
import com.example.test.demo.service.HelloService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestDemoApplicationTests {

	@Autowired
	HelloService helloService;

	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void testGet() {
		assertEquals("Hello JUnit 5", helloService.get());
	}

}
