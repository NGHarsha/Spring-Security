package com.springsecurity.springsecuritymongo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.springsecuritymongo.mongo.MyUserDetails;
import com.springsecurity.springsecuritymongo.mongo.UserRepo;
import com.springsecurity.springsecuritymongo.mongo.User;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found: " + username));
		
		return user.map(MyUserDetails::new).get();
	}

}
