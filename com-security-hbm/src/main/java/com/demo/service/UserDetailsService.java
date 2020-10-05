package com.demo.service;

import com.demo.model.User;

public interface UserDetailsService {
	String loadUserByUsername(User user);
}
