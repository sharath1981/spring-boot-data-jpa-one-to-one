package com.datajpa.onetoone.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.onetoone.domain.User;
import com.datajpa.onetoone.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("api/v1/users")
@RestController
public class UserController {
	
	private final UserRepository userRepository;
	
	@GetMapping
	public List<User> list() {
		return userRepository.findAll();
	}
	
	@PostMapping
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("{id}")
	public User findById(@PathVariable Integer id) {
		return userRepository.findById(id)
				             .orElseThrow();
	}


}
