package com.kindergarden.aggregator.KinderGardenAggregator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
public class KinderGarden {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String name;
    private int capacitySpecialEducationNeeds;
    private int capacityChronicDecease;
    private int capacitySocialCriteria;
    private int overallCapacity;
    private String googleMapsUrl;
    private String notes;
}
