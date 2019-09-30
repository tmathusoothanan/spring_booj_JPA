package com.wisdom.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Burgers {
	@Id
	//@GeneratedValue
	@Column(name="bid")
	private Integer bId;
	
	@Column(name="bName")
	private String bName;
	
	@Column(name="bPrice")
	private Integer bPrice;
	
	
	public Burgers(Integer bId, String bName, Integer bPrice) {
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}
	
	
	
	
	public Burgers() {
		
	}
	
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Integer getbPrice() {
		return bPrice;
	}
	public void setbPrice(Integer bPrice) {
		this.bPrice = bPrice;
	}
}
