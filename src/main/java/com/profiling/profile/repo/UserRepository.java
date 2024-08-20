package com.profiling.profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profiling.profile.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
