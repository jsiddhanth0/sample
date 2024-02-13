package com.example.sam;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
@RestController
@RequestMapping("/execute")
public class query {
	
	@Autowired
	private EntityManager rplentity;
	
	@PostMapping("/query")
    public List<?> executeQuery(@RequestBody String query) {
        Query q = rplentity.createNativeQuery(query); // Use createNativeQuery for SQL
        return q.getResultList();
	}
}
