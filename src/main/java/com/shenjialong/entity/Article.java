package com.shenjialong.entity;

import java.util.List;

public class Article {

	private Integer id;
	
	private String title;
	
	private String content;
	
	private String created;
	
	private Integer commentCnt;
	
	private List<User> users;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Integer getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Article(Integer id, String title, String content, String created, Integer commentCnt, List<User> users) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.created = created;
		this.commentCnt = commentCnt;
		this.users = users;
	}

	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", created=" + created
				+ ", commentCnt=" + commentCnt + ", users=" + users + "]";
	}
	
	
}
