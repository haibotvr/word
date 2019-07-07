package com.simon.boot.word;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordApplicationTests {

	@Test
	public void contextLoads() {
		try {
			String encrypt = ConfigTools.encrypt("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKV2SMCZ2c47iBsYnP3uiYTKiYXZpJdqffx3g0kLPkY/YBSbyeYbWG5JRXxscz4oZTR+RZksff2FBwGGxEyafusCAwEAAQ==", "7589014bnAa");
			System.out.println(encrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
