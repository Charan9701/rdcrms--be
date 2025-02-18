package com.pst.rdcrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class RdcrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdcrmsApplication.class, args);
	}

}
