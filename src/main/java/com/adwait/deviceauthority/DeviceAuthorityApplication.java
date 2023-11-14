package com.adwait.deviceauthority;

import com.adwait.deviceauthority.repository.DeviceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeviceAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceAuthorityApplication.class, args);
	}

}
