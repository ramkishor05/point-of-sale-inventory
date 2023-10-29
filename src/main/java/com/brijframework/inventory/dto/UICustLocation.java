package com.brijframework.inventory.dto;

import java.io.Serializable;

public class UICustLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String idenNo;
	private String typeId;
	private float orderSequence;
	private long custStorageId;
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

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
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

	public long getCustStorageId() {
		return custStorageId;
	}

	public void setCustStorageId(long custStorageId) {
		this.custStorageId = custStorageId;
	}

	public long getCustBusinessAppId() {
		return custBusinessAppId;
	}

	public void setCustBusinessAppId(long custBusinessAppId) {
		this.custBusinessAppId = custBusinessAppId;
	}

}