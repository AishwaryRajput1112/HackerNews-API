package com.hackernews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackernews.idao.Idao;
import com.hackernews.iservice.Iservice;
import com.hackernews.model.Story;

@Service
public class ServiceImpl implements Iservice {
	
	@Autowired
	private Idao idoa;

	@Override
	public List getStory() {
		
		return  idoa.getTopTenStories();
	//	return story;
				
				
		
	}

	@Override
	public List getPastStory() {
		// TODO Auto-generated method stub
		return  idoa.getAllPastStories();
	}

	@Override
	public  List getComment() {
		
		return idoa.getcomments();
		
	}
	
	

}
