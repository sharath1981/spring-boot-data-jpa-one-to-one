package com.datajpa.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.onetoone.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
