package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		userService.save(User.builder()
				.id("2545b500-d92e-483d-b2a2-fa8279082k58")
				.name("Mauricio Melo")
				.build());
	}

}
