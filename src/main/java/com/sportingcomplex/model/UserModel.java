package com.sportingcomplex.model;

import java.sql.Date;
import java.sql.Timestamp;

public class UserModel {
	private Long id;
	private String userName;
	private String fullName;
	private String passWord;
	private String address;
	private String phoneNumber;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private Long roleId;
	private String gender;
	private Date dateOfBrth;
	private RoleModel role = new RoleModel();
	
	public RoleModel getRole() {
		return role;
	}
	public void setRole(RoleModel role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Date getDateOfBrth() {
		return dateOfBrth;
	}
	public void setDateOfBrth(Date dateOfBrth) {
		this.dateOfBrth = dateOfBrth;
	}
	
	
}