package com.woniu.jt.pojo;

import java.io.Serializable;

public class UserPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String account;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPO [id=" + id + ", account=" + account + ", password=" + password + "]";
	}
	public static void main(String[] args) {
		System.out.println("叫爸爸");
	}
	public void name() {
		System.out.println("开始书写代码");
	}
}
