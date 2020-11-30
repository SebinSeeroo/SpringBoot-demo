package com.code.demo.Repository;

import com.code.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findFirstByOrderByIdDesc();
}

