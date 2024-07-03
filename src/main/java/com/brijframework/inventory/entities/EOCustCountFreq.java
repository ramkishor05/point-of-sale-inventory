package com.brijframework.inventory.entities;
import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.DAYS;
import static com.brijframework.inventory.contants.Constants.DESC;
import static com.brijframework.inventory.contants.Constants.EOCUST_COUNT_FREQ;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = EOCUST_COUNT_FREQ, uniqueConstraints = {@UniqueConstraint (columnNames = {CUST_BUSSINESS_APP_ID, NAME})})
public class EOCustCountFreq extends EOCustObject{
	

	private static final long serialVersionUID = 1L;
	
	@Column(name = NAME)
	public String name;
	
	@Column(name = DESC)
	public String desc;
	
	@Column(name = TYPE_ID)
	public String typeId;
	
	@Column(name = DAYS)
	public Long days;

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

	public Long getDays() {
		return days;
	}

	public void setDays(Long days) {
		this.days = days;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}
	
}
