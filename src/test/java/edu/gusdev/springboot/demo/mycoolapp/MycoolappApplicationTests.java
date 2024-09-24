package edu.gusdev.springboot.demo.mycoolapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import edu.gusdev.springboot.demo.mycoolapp.components.RandomString;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MycoolappApplicationTests {

	@Autowired
	RandomString randStringTest;

	@Test
	void contextLoads() {
	}

	@Test
	void RandomStringtest() {
		randStringTest.generateRandomString(10);
	}

}
