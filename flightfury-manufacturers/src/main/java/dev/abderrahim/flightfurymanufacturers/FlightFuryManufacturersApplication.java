package dev.abderrahim.flightfurymanufacturers;

import dev.abderrahim.flightfurymanufacturers.models.Manufacturer;
import dev.abderrahim.flightfurymanufacturers.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FlightFuryManufacturersApplication implements CommandLineRunner {


    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FlightFuryManufacturersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        manufacturerRepository.saveAll(List.of(
                new Manufacturer("Northrop Grumman Corporation","West Falls Church, Virginia","USA",1994),
                new Manufacturer("Boeing","Crystal City, Virginia","USA",1916)
        ));
    }
}
