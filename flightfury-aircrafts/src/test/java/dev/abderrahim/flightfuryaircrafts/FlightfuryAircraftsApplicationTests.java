package dev.abderrahim.flightfuryaircrafts;

import dev.abderrahim.flightfuryaircrafts.models.Aircraft;
import dev.abderrahim.flightfuryaircrafts.models.Projections;
import dev.abderrahim.flightfuryaircrafts.repositories.AircraftRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightfuryAircraftsApplicationTests {

    private final AircraftRepository aircraftRepository;
    
    @Autowired
    FlightfuryAircraftsApplicationTests(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }
    
    @Test
    void statsTest(){
       Optional<Projections.AircraftStats> stats = aircraftRepository.stats();
       
       assertAll(
               () -> assertNotNull(stats.orElse(null)),
               () -> assertTrue(stats.get().minWeight() < stats.get().maxWeight())
       );
    }

    @Test
    void icaoCodeTest(){

        String f16IcaoCode = "F16";
        Optional<Aircraft> f16 = aircraftRepository.icaoCode(f16IcaoCode);

        assertAll(
                () -> assertNotNull(f16.get()),
                () -> assertEquals(f16IcaoCode,f16.get().getIcaoCode())
        );
    }

}
