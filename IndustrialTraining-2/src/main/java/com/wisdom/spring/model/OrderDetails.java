package com.wisdom.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	
	@Id
	@Column(name="oId")
	private Integer oId;
	
	@Column(name="bId")
	private Integer bId;
	
	public OrderDetails() {
		
	}

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}
	
	
}
