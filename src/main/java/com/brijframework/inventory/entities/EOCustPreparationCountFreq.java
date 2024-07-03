package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_COUNT_FREQ_ID;
import static com.brijframework.inventory.contants.Constants.CUST_PREP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_PREPARATION_COUNT_FREQ;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION_COUNT_FREQ, uniqueConstraints = {
		@UniqueConstraint(columnNames = { CUST_BUSSINESS_APP_ID, CUST_PREP_ID, CUST_COUNT_FREQ_ID }) })
public class EOCustPreparationCountFreq extends EOCustObject {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = CUST_PREP_ID)
	public EOCustPreparation custPreparation;

	@OneToOne
	@JoinColumn(name = CUST_COUNT_FREQ_ID)
	public EOCustCountFreq custCountFreq;

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
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
