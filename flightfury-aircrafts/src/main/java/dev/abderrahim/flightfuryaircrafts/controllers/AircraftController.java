package dev.abderrahim.flightfuryaircrafts.controllers;

import dev.abderrahim.flightfuryaircrafts.repositories.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;


@RepositoryRestController(path = "aircrafts/aircraft")
@ResponseBody
public class AircraftController {

    private final AircraftRepository aircraftRepository;

    @Autowired
    public AircraftController(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

}
