package dev.abderrahim.aviation.controllers;

import dev.abderrahim.aviation.models.Aircraft;
import dev.abderrahim.aviation.repos.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RepositoryRestController(path = "/aircrafts/aircraft")
@ResponseBody
public class AircraftController {

    private final AircraftRepository aircraftRepository;

    @Autowired
    public AircraftController(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Optional<Aircraft> getAircraftByCode(@RequestParam(name = "icaoCode") String icaoCode) {
        return aircraftRepository.icaoCode(icaoCode);
    }

}
