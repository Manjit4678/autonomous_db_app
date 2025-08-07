package com.oracle.autonomousapp.repository;

import com.oracle.autonomousapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
