package dev.abderrahim.flightfury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightFuryAircraftsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightFuryAircraftsApplication.class, args);
    }

    /*
    @Bean
    public CommandLineRunner runner(AircraftRepository aircraftRepository) {
        return args -> {
            System.out.println(aircraftRepository.findTopByOrderByMaxSpeedDesc());
        };
    }
     */
}
