package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_UNIT_GROUP_ID;
import static com.brijframework.inventory.contants.Constants.DESC;
import static com.brijframework.inventory.contants.Constants.EOCUST_UNIT;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = EOCUST_UNIT)
public class EOCustUnit extends EOCustObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = NAME)
	public String name;
	
	@Column(name = DESC)
	public String desc;
	
	@Column(name = TYPE_ID)
	public String typeId;
		
	@ManyToOne
	@JoinColumn(name=CUST_UNIT_GROUP_ID)
	public EOCustUnitGroup  custUnitGroup;
	
	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public EOCustUnitGroup getCustUnitGroup() {
		return custUnitGroup;
	}

	public void setCustUnitGroup(EOCustUnitGroup custUnitGroup) {
		this.custUnitGroup = custUnitGroup;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}
}
