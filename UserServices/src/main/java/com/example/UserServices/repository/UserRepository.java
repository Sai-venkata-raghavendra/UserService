package com.example.UserServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserServices.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,String>{

}
