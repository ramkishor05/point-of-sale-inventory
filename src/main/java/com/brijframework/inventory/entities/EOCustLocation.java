package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.CUST_LOCATION;
import static com.brijframework.inventory.contants.Constants.CUST_BUSSINESS_APP_ID;
import static com.brijframework.inventory.contants.Constants.CUST_STORAGE_ID;
import static com.brijframework.inventory.contants.Constants.EOCUST_INGREDIENT_LOCATION;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

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
@Table(name = EOCUST_INGREDIENT_LOCATION, uniqueConstraints = { @UniqueConstraint(columnNames = { CUST_BUSSINESS_APP_ID, NAME }) })
public class EOCustLocation extends EOCustObject {

	private static final long serialVersionUID = 1L;
	@Column(name = NAME)
	public String name;
	
	@Column(name = TYPE_ID)
	public String typeId;

	@JoinColumn(name = CUST_BUSSINESS_APP_ID, nullable = false)
	@ManyToOne
	private EOCustBusinessApp custBusinessApp;

	@ManyToOne
	@JoinColumn(name = CUST_STORAGE_ID, nullable = false)
	public EOCustStorage custStorage;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustIngredientLocation> custIngredientLocationList;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustPreparationLocation> custPreparationLocationList;

	@OneToMany(mappedBy = CUST_LOCATION)
	public Set<EOCustProductLocation> custProductLocationList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public EOCustStorage getCustStorage() {
		return custStorage;
	}

	public void setCustStorage(EOCustStorage custStorage) {
		this.custStorage = custStorage;
	}

	public Set<EOCustIngredientLocation> getCustIngredientLocationList() {
		return custIngredientLocationList;
	}

	public void setCustIngredientLocationList(Set<EOCustIngredientLocation> custIngredientLocationList) {
		this.custIngredientLocationList = custIngredientLocationList;
	}

	public Set<EOCustPreparationLocation> getCustPreparationLocationList() {
		return custPreparationLocationList;
	}

	public void setCustPreparationLocationList(Set<EOCustPreparationLocation> custPreparationLocationList) {
		this.custPreparationLocationList = custPreparationLocationList;
	}

	public Set<EOCustProductLocation> getCustProductLocationList() {
		return custProductLocationList;
	}

	public void setCustProductLocationList(Set<EOCustProductLocation> custProductLocationList) {
		this.custProductLocationList = custProductLocationList;
	}
}
