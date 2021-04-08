package com.hackernews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackernews.iservice.Iservice;

@RestController
@RequestMapping(value = "/")
public class StoryController {

	@Autowired
	private Iservice iservice;
	
	@GetMapping(value = "/beststories")
	public ResponseEntity retriveStory()
	{
		System.out.println("beststories");
		List list=iservice.getStory();
		
		
	return new ResponseEntity(list,HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value = "past-stories")
	public ResponseEntity retrivePastStory()
	{
	 List list=iservice.getPastStory();
		
		
	return new ResponseEntity(list,HttpStatus.OK);	
	}
	
	@GetMapping(value = "comments")
	public ResponseEntity retriveComments()
	{
	List l = iservice.getComment();
		
		
	return new ResponseEntity(l,HttpStatus.OK);	
	}
	
	
	
}
