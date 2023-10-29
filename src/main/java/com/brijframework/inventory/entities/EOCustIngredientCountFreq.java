package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_COUNT_FREQ_ID;
import static com.brijframework.inventory.contants.Constants.CUST_INGR_ID;
import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_INGREDIENT_COUNT_FREQ;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_INGREDIENT_COUNT_FREQ, uniqueConstraints = {
		@UniqueConstraint(columnNames = { CUST_BUSSINESS_APP_ID, CUST_INGR_ID, CUST_COUNT_FREQ_ID }) })
public class EOCustIngredientCountFreq extends EOCustObject {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = CUST_INGR_ID)
	public EOCustIngredient custIngredient;

	@OneToOne
	@JoinColumn(name = CUST_COUNT_FREQ_ID)
	public EOCustCountFreq custCountFreq;

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	public EOCustIngredient getCustIngredient() {
		return custIngredient;
	}

	public void setCustIngredient(EOCustIngredient custIngredient) {
		this.custIngredient = custIngredient;
	}

	public EOCustCountFreq getCustCountFreq() {
		return custCountFreq;
	}

	public void setCustCountFreq(EOCustCountFreq custCountFreq) {
		this.custCountFreq = custCountFreq;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}

}
