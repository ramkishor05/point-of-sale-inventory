package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_PREPARATION;
import static com.brijframework.inventory.contants.Constants.EOCUST_PREPARATION;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.QNT;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_PREPARATION, uniqueConstraints = { @UniqueConstraint(columnNames = { CUST_BUSSINESS_APP_ID, NAME }) })
public class EOCustPreparation extends EOCustItem {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = QNT)
	public Double qnt;

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationLocation> custPreparationLocationList;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationCountFreq> custPreparationCountFreqList;

	@OneToMany(mappedBy = CUST_PREPARATION)
	public Set<EOCustPreparationRecipe> custPreparationRecipeList;

	public Double getQnt() {
		return qnt;
	}

	public void setQnt(Double qnt) {
		this.qnt = qnt;
	}

	public EOCustBusinessApp getCustBusinessApp() {
		return custBusinessApp;
	}

	public void setCustBusinessApp(EOCustBusinessApp custBusinessApp) {
		this.custBusinessApp = custBusinessApp;
	}

	public Set<EOCustPreparationLocation> getCustPreparationLocationList() {
		return custPreparationLocationList;
	}

	public void setCustPreparationLocationList(Set<EOCustPreparationLocation> custPreparationLocationList) {
		this.custPreparationLocationList = custPreparationLocationList;
	}

	public Set<EOCustPreparationCountFreq> getCustPreparationCountFreqList() {
		return custPreparationCountFreqList;
	}

	public void setCustPreparationCountFreqList(Set<EOCustPreparationCountFreq> custPreparationCountFreqList) {
		this.custPreparationCountFreqList = custPreparationCountFreqList;
	}

	public Set<EOCustPreparationRecipe> getCustPreparationRecipeList() {
		return custPreparationRecipeList;
	}

	public void setCustPreparationRecipeList(Set<EOCustPreparationRecipe> custPreparationRecipeList) {
		this.custPreparationRecipeList = custPreparationRecipeList;
	}
	
}
