package com.Ehcachemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UsersResourceController {
	
	@Autowired
	UserCache usersCache;
	
	@GetMapping(value = "/{topicname}")
	public List<List<String>> getUsersInfo(@PathVariable String topicname) {
		
		
		return usersCache.getUser(topicname);
	}
}
