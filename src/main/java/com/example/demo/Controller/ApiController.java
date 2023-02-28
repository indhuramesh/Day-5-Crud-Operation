package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.ApiService;

@RestController

public class ApiController {
	
	@Autowired
	ApiService as;
	
	@PostMapping("/addDetails")
	public Book addInfo(@RequestBody Book b)
	{
		return as.saveDetails(b);
	}
	
	@GetMapping("/showDetails/{id}")
	public List<Book> getInfo()
	{
		return as.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public Book updateInfo(@RequestBody Book b1)
	{
		return as.updateDetails(b1);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id)
	{
		as.deleteDetails(id);
		return "Deleted details";
	}

}
