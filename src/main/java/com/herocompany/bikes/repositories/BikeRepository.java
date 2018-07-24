package com.herocompany.bikes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herocompany.bikes.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
