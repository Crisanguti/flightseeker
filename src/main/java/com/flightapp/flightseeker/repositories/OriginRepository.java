package com.flightapp.flightseeker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flightapp.flightseeker.entities.Origin;

@Repository
public interface OriginRepository extends JpaRepository <Origin, Long> {
}
