package com.wisdom.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	@Column(name="oId")
	private Integer oId;
	
	@Column(name="oDate")
	private Date date;
	
	@Column(name="oAddress")
	private String oAddress;
	
	public Orders() {
		
	}

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return oAddress;
	}

	public void setAddress(String oAddress) {
		this.oAddress = oAddress;
	}
	
	
}
