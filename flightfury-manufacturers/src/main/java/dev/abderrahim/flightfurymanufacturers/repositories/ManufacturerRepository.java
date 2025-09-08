package dev.abderrahim.flightfurymanufacturers.repositories;

import dev.abderrahim.flightfurymanufacturers.models.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManufacturerRepository extends MongoRepository<Manufacturer, Long> {
}
