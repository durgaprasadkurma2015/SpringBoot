package com.example.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curd.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
