package com.minori.hrm.models;

import javax.persistence.*;

/**
 * Created by VINH_IT on 12/19/2017.
 */
@Entity
@Table(name="user_device_token")
@NamedQuery(name="UserDeviceToken.findAll", query="SELECT u FROM UserDeviceToken u")
public class UserDeviceToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_device_token_id")
	private String userDeviceTokenId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public UserDeviceToken() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserDeviceTokenId() {
		return userDeviceTokenId;
	}
	
	public void setUserDeviceTokenId(String userDeviceTokenId) {
		this.userDeviceTokenId = userDeviceTokenId;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
