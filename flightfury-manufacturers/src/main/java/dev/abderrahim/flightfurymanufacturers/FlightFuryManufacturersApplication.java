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
                new Manufacturer(1,"Northrop","Hawthorne, California, United States",1939),
                new Manufacturer(2,"Boeing","Crystal City, Virginia, United States",1916),
                new Manufacturer(3,"Lockheed - General Dynamics","Reston, Virginia, United States",1893),
                new Manufacturer(4,"Lockheed","Calabasas, California, United States",1926),
                new Manufacturer(5,"Boeing - McDonnell Douglas","Calabasas, California, United States",1926),
                new Manufacturer(6,"Honda","Toranomon, Minato, Tokyo, Japan",1946),
                new Manufacturer(7,"Soukhoï","Begovoy District, Moscow, Russia",1939),
                new Manufacturer(8,"North American Aviation","Los Angeles, California, United States",1928),
                new Manufacturer(9,"CASA","Getafe, Spain",1923)
        ));
    }
}
