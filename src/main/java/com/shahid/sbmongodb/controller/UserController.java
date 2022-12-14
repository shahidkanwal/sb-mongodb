package com.shahid.sbmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahid.sbmongodb.dao.UserDao;
import com.shahid.sbmongodb.model.User;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDao userDao;
	
	@GetMapping("/")
	public ResponseEntity<?> getAllUser() {
		System.out.println("in the get all");
		List<User> users = this.userDao.findAll();
		if (users.size() >0) {
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		}
		return new ResponseEntity<>("No users available", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		this.userDao.save(user);
		return user;
	
	}
	
	@GetMapping("/saveUser")
	public User saveuser() {
		User user = new User(3,"zakria","description");
		user = this.userDao.save(user);
		System.out.println(user);
		return user;
	
	}
	@GetMapping("/{user_id}")
	public User getusUser(@PathVariable("user_id") int user_id) {
		User user = this.userDao.findById(user_id).get();
		return user;
	}
}
