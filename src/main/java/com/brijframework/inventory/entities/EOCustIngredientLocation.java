package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_INGR_ID;
import static com.brijframework.inventory.contants.Constants.CUST_LOCATION_ID;
import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_INGREDIENT_LOCATION;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_INGREDIENT_LOCATION, uniqueConstraints = { 
		@UniqueConstraint(columnNames = { CUST_BUSSINESS_APP_ID,CUST_INGR_ID, CUST_LOCATION_ID }) })
public class EOCustIngredientLocation extends EOCustObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name=CUST_INGR_ID)
	public EOCustIngredient custIngredient;
	
	@ManyToOne
	@JoinColumn(name=CUST_LOCATION_ID)
	public EOCustLocation custLocation;

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	public EOCustIngredient getCustIngredient() {
		return custIngredient;
	}

	public void setCustIngredient(EOCustIngredient custIngredient) {
		this.custIngredient = custIngredient;
	}

	public EOCustLocation getCustLocation() {
		return custLocation;
	}

	public void setCustLocation(EOCustLocation custLocation) {
		this.custLocation = custLocation;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}
	
}

