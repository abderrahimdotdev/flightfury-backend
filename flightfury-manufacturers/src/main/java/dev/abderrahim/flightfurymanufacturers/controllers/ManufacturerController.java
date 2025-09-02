package dev.abderrahim.flightfurymanufacturers.controllers;

import dev.abderrahim.flightfurymanufacturers.models.Manufacturer;
import dev.abderrahim.flightfurymanufacturers.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/manufacturers")
public class ManufacturerController {

    private final ManufacturerRepository manufacturerRepository;

    @GetMapping
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Autowired
    public ManufacturerController(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }
}
