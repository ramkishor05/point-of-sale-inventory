package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_UNIT_GROUP;
import static com.brijframework.inventory.contants.Constants.DESC;
import static com.brijframework.inventory.contants.Constants.EOCUST_UNIT_GROUP;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = EOCUST_UNIT_GROUP)
public class EOCustUnitGroup extends EOCustObject {

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

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	@OneToMany(mappedBy = CUST_UNIT_GROUP)
	public Set<EOCustUnit> custUnitList ;

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

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}

	public Set<EOCustUnit> getCustUnitList() {
		return custUnitList;
	}

	public void setCustUnitList(Set<EOCustUnit> custUnitList) {
		this.custUnitList = custUnitList;
	}
	
}