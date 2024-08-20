package com.profiling.profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profiling.profile.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
