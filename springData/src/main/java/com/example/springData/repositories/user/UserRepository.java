package com.example.springData.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springData.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
