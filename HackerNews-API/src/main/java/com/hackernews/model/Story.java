package com.hackernews.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Story {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	private String title;
	private String URL;
	private String score;
	private Timestamp timeofsubmission;

	@OneToMany(cascade = CascadeType.ALL)  
	private List<Comment> comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public Timestamp getTimeofsubmission() {
		return timeofsubmission;
	}

	public void setTimeofsubmission(Timestamp timeofsubmission) {
		this.timeofsubmission = timeofsubmission;
	}

	
	// private User user;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
