package dev.abderrahim.flightfuryaircrafts.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AIRCRAFTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "ICAO_CODE", nullable = false, unique = true)
    private String icaoCode;

    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column(name = "MANUFACTURER_ID", nullable = false)
    private Long manufacturerId;

    @Column(name = "MODEL_FAA")
    private String modelFAA;

    @Column(name = "MODEL_BADA")
    private String modelBADA;

    @Column(name = "PHYSICAL_CLASS_ENGINE")
    private String physicalClassEngine;

    @Column(name = "NUM_ENGINES")
    private int numEngines;

    @Column(name = "LENGTH")
    private double length;

    @Column(name = "HEIGHT")
    private double height;

    @Column(name = "WINGSPAN")
    private double wingspan;

    @Column(name = "MAX_SPEED")
    private int maxSpeed;

    @Column(name = "WEIGHT")
    private int weight;

    @Column(name = "IMAGE_URL")
    private String imageUrl;
}


