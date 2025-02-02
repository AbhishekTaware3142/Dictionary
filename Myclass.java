package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@CrossOrigin(origins = "http://localhost:3000") // Replace with the origin of your React app
public class Myclass {
	@Autowired
	DicRepository repo;
	 
	@PostMapping("/adddic")
	public Dictionary adddic(@RequestBody Dictionary e){
		//TODO: process POST request
		
		return repo.save(e);
		
	}
	
	@PutMapping("/update")
	public Dictionary updatedic(@RequestBody  Dictionary e){
		//TODO: process POST request
		
		return repo.save(e);}
	
	@DeleteMapping("/delete")
	public Dictionary deletedic(@RequestBody Dictionary e){
		//TODO: process POST request
		repo.delete(e);
		return e;}
	@GetMapping("/getdic")
	public List<Dictionary>showEmp(){
		//TODO: process POST request
		
		return repo.findAll();}
	
	
	

	

}
