package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service

public class ApiService {
	@Autowired(required=true)
	BookRepo br;
	
	public Book saveDetails(Book b)
	{
		return br.save(b);
	}
	public List<Book> getDetails()
	{
		return br.findAll();
	}
	public Book updateDetails(Book b1)
	{
		return br.saveAndFlush(b1);
	}
	public String  deleteDetails(int id)
	{
		br.deleteById(id);
		return "Deleted Details";
	}

}
