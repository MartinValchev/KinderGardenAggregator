package com.kindergarden.aggregator.KinderGardenAggregator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class KinderGardenApplicant {
    @Id
    @Setter
    @Getter
    private UUID id;
    private String shortName;
    private boolean hasSpecialEducationNeeds;
    private boolean hasChronicDecease;
    private boolean hasSocialCriteria;
}
