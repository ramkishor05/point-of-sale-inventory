package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_LOCATION_ID;
import static com.brijframework.inventory.contants.Constants.CUST_PRODUCT_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_PRODUCT_LOCATION;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PRODUCT_LOCATION, uniqueConstraints = {@UniqueConstraint (columnNames = { CUST_PRODUCT_ID, CUST_LOCATION_ID })})
public class EOCustProductLocation extends EOCustObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	@ManyToOne
	@JoinColumn(name=CUST_PRODUCT_ID)
	public EOCustProduct custProduct;
	
	@ManyToOne
	@JoinColumn(name=CUST_LOCATION_ID)
	public EOCustLocation custLocation;

	public EOCustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(EOCustProduct custProduct) {
		this.custProduct = custProduct;
	}

	public EOCustLocation getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(EOCustLocation custLocation) {
		this.custLocation = custLocation;
	}
	
}