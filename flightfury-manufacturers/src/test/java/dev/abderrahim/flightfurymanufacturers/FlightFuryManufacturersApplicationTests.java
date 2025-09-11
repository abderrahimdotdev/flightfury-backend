package dev.abderrahim.flightfurymanufacturers;

import dev.abderrahim.flightfurymanufacturers.controllers.ManufacturerController;
import dev.abderrahim.flightfurymanufacturers.models.Manufacturer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FlightFuryManufacturersApplicationTests {

    private final ManufacturerController manufacturerController;

    @Autowired
    public FlightFuryManufacturersApplicationTests(ManufacturerController manufacturerController) {
        this.manufacturerController = manufacturerController;
    }

    @Test
    void findOneTest() {
        long lookupId = 2;
        Manufacturer boeing = manufacturerController.findOne(lookupId).get();

        assertAll(
                () -> assertEquals(lookupId, boeing.getId()),
                () -> assertEquals("Boeing", boeing.getName())
        );
    }

}
