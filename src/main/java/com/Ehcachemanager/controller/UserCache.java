package com.Ehcachemanager.controller;

import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.Ehcachemanager.config.ConfigStoreDB;

@Component
public class UserCache {

	@Cacheable(value = "usersCache", key = "#topicname")
	public List<List<String>> getUser(String topicname) {
		System.out.println("Retrieving info from db ");

		return ConfigStoreDB.getAllsubscriberInfo("Model", topicname);

	}

}
