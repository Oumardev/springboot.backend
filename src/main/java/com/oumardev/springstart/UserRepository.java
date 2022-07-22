package com.oumardev.springstart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oumardev.springstart.domaine.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
