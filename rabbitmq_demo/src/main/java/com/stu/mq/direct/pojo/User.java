package com.stu.mq.direct.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String pass;

	public String getName() {
		return name;
	}
	
	

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + "]";
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
