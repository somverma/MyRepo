package com.cg.friends.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Friends {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String email;
	@Column
	private String friendsList;
	@Column
	private String subcriptionList;
	@Column
	private String updatedTimeStamp;
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFriendsList() {
		return friendsList;
	}
	public void setFriendsList(String friendsList) {
		this.friendsList = friendsList;
	}
	public String getSubcriptionList() {
		return subcriptionList;
	}
	public void setSubcriptionList(String subcriptionList) {
		this.subcriptionList = subcriptionList;
	}
	public String getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}
	public void setUpdatedTimeStamp(String updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
		
}
