package com.kindergarden.aggregator.KinderGardenAggregator.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
public class KinderGardenApplication {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "kinder_garden_id")
    private KinderGarden kinderGarden;

    @ManyToOne
    @JoinColumn(name = "kinder_garden_subscriber_id")
    private KinderGardenApplicant kinderGardenSubscriber;

    private int points;

}
