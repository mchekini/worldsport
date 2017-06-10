package com.sm;

import com.sm.config.DataBaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DataBaseConfig.class)
public class WorldsportApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldsportApplication.class, args);
	}
}
