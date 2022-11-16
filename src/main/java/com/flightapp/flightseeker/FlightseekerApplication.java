package com.flightapp.flightseeker;

import com.flightapp.flightseeker.entities.Origin;
import com.flightapp.flightseeker.repositories.OriginRepository;
import com.flightapp.flightseeker.PriceRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FlightseekerApplication {

	public static void main(String[] args) {
	ApplicationContext context	= SpringApplication.run(FlightseekerApplication.class, args);
	context.getBean(OriginRepository.class);
	OriginRepository originRepository = context.getBean(OriginRepository.class);
	

	}

}
