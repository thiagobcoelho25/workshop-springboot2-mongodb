package com.thiagoribeiro.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagoribeiro.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET) // ou @GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1","Maria","maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.add(maria);
		
		return ResponseEntity.ok().body(list);
	}
}