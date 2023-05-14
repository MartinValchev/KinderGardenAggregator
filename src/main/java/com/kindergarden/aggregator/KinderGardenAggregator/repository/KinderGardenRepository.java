package com.kindergarden.aggregator.KinderGardenAggregator.repository;

import com.kindergarden.aggregator.KinderGardenAggregator.entity.KinderGarden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface KinderGardenRepository extends CrudRepository<KinderGarden, UUID>,
        PagingAndSortingRepository<KinderGarden, UUID> {
}
