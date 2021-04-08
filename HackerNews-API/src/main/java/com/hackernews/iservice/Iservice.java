package com.hackernews.iservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hackernews.model.Story;


public interface Iservice {

	public List getStory();

	public List getPastStory();

	public List getComment();

}
