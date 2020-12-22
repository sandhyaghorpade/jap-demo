package com.cg.training.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;



@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;
    
    @Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="created_time")
    private Date creationTime;
    
    @Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="updated_time")
    private Date updatedTime;
    
    @Temporal(value=TemporalType.DATE)
    @Column(name="dob")
    private Date dateofBirth;
    
    
    @Lob
    @Column(name="profile_pic")
    @Basic(fetch = FetchType.LAZY)
    private byte[] profilePic;


	public User() {
		super();
	}


	public User(Long id, String userName, String password, Date creationTime, Date updatedTime, Date dateofBirth,
			byte[] profilePic) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.creationTime = creationTime;
		this.updatedTime = updatedTime;
		this.dateofBirth = dateofBirth;
		this.profilePic = profilePic;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}


	public Date getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}


	public Date getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public byte[] getProfilePic() {
		return profilePic;
	}


	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", creationTime=" + creationTime
				+ ", updatedTime=" + updatedTime + ", dateofBirth=" + dateofBirth + ", profilePic="
				+ Arrays.toString(profilePic) + "]";
	}
    
    

}
