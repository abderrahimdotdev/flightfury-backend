package dev.abderrahim.flightfurymanufacturers.controllers;

import dev.abderrahim.flightfurymanufacturers.models.Manufacturer;
import dev.abderrahim.flightfurymanufacturers.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/manufacturers")
@CrossOrigin(origins = {"*"})
public class ManufacturerController {

    private final ManufacturerRepository manufacturerRepository;

    @Autowired
    public ManufacturerController(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @GetMapping
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Manufacturer> findOne(@PathVariable(name = "id") long id) {
        return manufacturerRepository.findById(id);
    }
}
