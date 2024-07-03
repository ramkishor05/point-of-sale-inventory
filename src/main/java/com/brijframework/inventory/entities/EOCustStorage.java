package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_STORAGE;
import static com.brijframework.inventory.contants.Constants.EOCUST_STORAGE;
import static com.brijframework.inventory.contants.Constants.IDEN_NO;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_STORAGE, uniqueConstraints = {
		@UniqueConstraint (columnNames = { 
				CUST_BUSSINESS_APP_ID, IDEN_NO })})
public class EOCustStorage extends EOCustItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name=CUST_BUSSINESS_APP_ID, nullable=false)
	private EOCustBusinessApp custBusinessApp;
	
	@OneToMany(mappedBy=CUST_STORAGE)
	public Set<EOCustLocation> custLocationList;

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}

	public Set<EOCustLocation> getCustLocationList() {
		return custLocationList;
	}

	public void setCustLocationList(Set<EOCustLocation> custLocationList) {
		this.custLocationList = custLocationList;
	}
}
