package com.brijframework.inventory.dto;

import java.io.Serializable;

public class UICustStorage implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String typeId;
	private float orderSequence;
	private long custBusinessAppId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public float getOrderSequence() {
		return orderSequence;
	}

	public void setOrderSequence(float orderSequence) {
		this.orderSequence = orderSequence;
	}

	public long getCustBusinessAppId() {
		return custBusinessAppId;
	}

	public void setCustBusinessAppId(long custBusinessAppId) {
		this.custBusinessAppId = custBusinessAppId;
	}

}
