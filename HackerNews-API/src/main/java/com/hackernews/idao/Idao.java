package com.hackernews.idao;

import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackernews.model.Story;
@Repository
public interface Idao  extends CrudRepository<Story, Integer>{

	
	public static final String QUERY_TOP_TEN_STORY = "select * from user u inner join user_story  on user_story.user_uid = u.uid   inner join story s on s.id = user_story.story_id and MINUTE(timeofsubmission) % 1 = 0 order by score desc limit 10;";
	@Query(value = QUERY_TOP_TEN_STORY, nativeQuery = true)
	public List getTopTenStories();
	
	public static final String QUERY_ALL_PAST_STORY = "select * from story s";
	@Query(value = QUERY_ALL_PAST_STORY, nativeQuery = true)
	public List getAllPastStories();
	
	public static final String QUERY_GET_COMMENTS = "select text, newshandle, noofyears  from comment inner join comment_child_comment on cid = comment_cid order by cid asc limit 10";
	@Query(value = QUERY_GET_COMMENTS, nativeQuery = true)
	public List getcomments();
	


	
}
