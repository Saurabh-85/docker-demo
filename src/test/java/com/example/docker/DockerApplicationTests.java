package com.example.docker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DockerApplicationTests {

	@Test
	@DisplayName("Default")
	void contextLoads() {
		System.out.println("Default Test");
	}

}
