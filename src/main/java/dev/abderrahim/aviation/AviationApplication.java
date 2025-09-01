package dev.abderrahim.aviation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AviationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviationApplication.class, args);
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
