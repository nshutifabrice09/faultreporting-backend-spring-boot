package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
