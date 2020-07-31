package com.Ehcahcemanager.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.Ehcachemanager"})
public class EhcahcemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcahcemanagerApplication.class, args);
	}

}
