package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_INGR_ID;
import static com.brijframework.inventory.contants.Constants.CUST_PREP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_PRODUCT_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_PRODUCT_RECIPE;
import static com.brijframework.inventory.contants.Constants.QNT;

import jakarta.persistence.Column;
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
@Table(name = EOCUST_PRODUCT_RECIPE, uniqueConstraints = {@UniqueConstraint (columnNames = { 
		CUST_PREP_ID, CUST_INGR_ID, CUST_PRODUCT_ID })})
public class EOCustProductRecipe extends EOCustObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = QNT)
	private Long qnt; 
	
	@OneToOne
	@JoinColumn(name=CUST_PREP_ID)
	private EOCustPreparation custPreparation;
	
	@OneToOne
	@JoinColumn(name=CUST_INGR_ID)
	private EOCustIngredient custIngredient;

	@ManyToOne
 	@JoinColumn(name=CUST_PRODUCT_ID)
	private EOCustProduct custProduct;

	public Long getQnt() {
		return qnt;
	}

	public void setQnt(Long qnt) {
		this.qnt = qnt;
	}

	public EOCustPreparation getCustPreparation() {
		return custPreparation;
	}

	public void setCustPreparation(EOCustPreparation custPreparation) {
		this.custPreparation = custPreparation;
	}

	public EOCustIngredient getCustIngredient() {
		return custIngredient;
	}

	public void setCustIngredient(EOCustIngredient custIngredient) {
		this.custIngredient = custIngredient;
	}

	public EOCustProduct getCustProduct() {
		return custProduct;
	}

	public void setCustProduct(EOCustProduct custProduct) {
		this.custProduct = custProduct;
	}

	
}
