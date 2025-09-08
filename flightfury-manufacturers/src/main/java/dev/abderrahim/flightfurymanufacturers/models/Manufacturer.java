package dev.abderrahim.flightfurymanufacturers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "manufacturers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
    @Id
    private long id;
    private String name;
    private String headquarters;
    private int foundingYear;
}
