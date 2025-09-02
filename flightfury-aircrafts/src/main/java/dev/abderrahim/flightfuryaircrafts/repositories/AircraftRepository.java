package dev.abderrahim.flightfuryaircrafts.repositories;


import dev.abderrahim.flightfuryaircrafts.models.Aircraft;
import dev.abderrahim.flightfuryaircrafts.models.Projections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path = "aircrafts",collectionResourceRel = "aircrafts")
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

    @RestResource(exported = false)
    Optional<Aircraft> findTopByOrderByMaxSpeedDesc();

    @RestResource(path = "stats")
    //@Query("select new dev.abderrahim.flightfury.models.AircraftStats(max(a.maxSpeed),max(a.height)) from Aircraft a")
    @Query("select max(a.maxSpeed),max(a.height),max(a.weight),max(a.wingspan),max(a.length) from Aircraft a")
    Optional<Projections.AircraftStats> stats();

    @RestResource(path = "/by")
    @Query("select a from Aircraft a where a.icaoCode = ?1")
    Optional<Aircraft> icaoCode(@PathVariable(name="icaCode") String icaoCode);
}
