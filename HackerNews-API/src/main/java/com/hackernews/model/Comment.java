package com.hackernews.model;

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
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int cid;
	public String text;
	private String newshandle;
	private int noofyears;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ChildComment> childComment;
	
	public List<ChildComment> getChildComment() {
		return childComment;
	}
	public void setChildComment(List<ChildComment> childComment) {
		this.childComment = childComment;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getNewshandle() {
		return newshandle;
	}
	public void setNewshandle(String newshandle) {
		this.newshandle = newshandle;
	}
	public int getNoofyears() {
		return noofyears;
	}
	public void setNoofyears(int noofyears) {
		this.noofyears = noofyears;
	}

}
