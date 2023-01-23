package ru.idc.reports;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class ReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportsApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Irkutsk"));
	}

}
