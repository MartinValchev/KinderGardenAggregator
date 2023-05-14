package com.kindergarden.aggregator.KinderGardenAggregator.repository;

import com.kindergarden.aggregator.KinderGardenAggregator.entity.KinderGardenApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface KinderGardenApplicationRepository extends CrudRepository<KinderGardenApplication, UUID>,
        PagingAndSortingRepository<KinderGardenApplication, UUID> {
}
