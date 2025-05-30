package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    void deleteByUsername(String username);

    User getUserByUsername(String username);


    User findAuthorById(Long authorId);
}
