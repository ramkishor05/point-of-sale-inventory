package com.brijframework.inventory.entities;
import static com.brijframework.inventory.contants.Constants.APPLICATION_ID;
import static com.brijframework.inventory.contants.Constants.BUSSINESS_ID;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP;
import static com.brijframework.inventory.contants.Constants.EOCUST_BUSSINESS_APP;
import static com.brijframework.inventory.contants.Constants.OWNER_ID;
import static com.brijframework.inventory.contants.Constants.VERSION;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOCUST_BUSSINESS_APP, uniqueConstraints = {@UniqueConstraint (columnNames = {BUSSINESS_ID, APPLICATION_ID, OWNER_ID, VERSION })})
public class EOCustBusinessApp extends EOCustObject {

	private static final long serialVersionUID = 1L;
	
	@Column(name = BUSSINESS_ID, nullable = false)
	private long bussinessId;

	@Column(name = APPLICATION_ID, nullable = false)
	private long applicationId;

	@Column(name = OWNER_ID, nullable = false)
	private long ownerId;
	
	@Column(name = VERSION, nullable = false)
	private long version;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustCountFreq> custCountFreqList;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustUnitGroup> custUnitGroupList;
	
	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustStorage> custStorageList;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustLocation> custLocationList;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustProduct> custProductList;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustIngredient> custIngredientList;

	@OneToMany(mappedBy = CUST_BUSINESS_APP)
	public Set<EOCustPreparation> custPreparationList;

	public long getBussinessId() {
		return bussinessId;
	}

	public void setBussinessId(long bussinessId) {
		this.bussinessId = bussinessId;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public Set<EOCustCountFreq> getCustCountFreqList() {
		return custCountFreqList;
	}

	public void setCustCountFreqList(Set<EOCustCountFreq> custCountFreqList) {
		this.custCountFreqList = custCountFreqList;
	}

	public Set<EOCustUnitGroup> getCustUnitGroupList() {
		return custUnitGroupList;
	}

	public void setCustUnitGroupList(Set<EOCustUnitGroup> custUnitGroupList) {
		this.custUnitGroupList = custUnitGroupList;
	}

	public Set<EOCustStorage> getCustStorageList() {
		return custStorageList;
	}

	public void setCustStorageList(Set<EOCustStorage> custStorageList) {
		this.custStorageList = custStorageList;
	}

	public Set<EOCustLocation> getCustLocationList() {
		return custLocationList;
	}

	public void setCustLocationList(Set<EOCustLocation> custLocationList) {
		this.custLocationList = custLocationList;
	}

	public Set<EOCustProduct> getCustProductList() {
		return custProductList;
	}

	public void setCustProductList(Set<EOCustProduct> custProductList) {
		this.custProductList = custProductList;
	}

	public Set<EOCustIngredient> getCustIngredientList() {
		return custIngredientList;
	}

	public void setCustIngredientList(Set<EOCustIngredient> custIngredientList) {
		this.custIngredientList = custIngredientList;
	}

	public Set<EOCustPreparation> getCustPreparationList() {
		return custPreparationList;
	}

	public void setCustPreparationList(Set<EOCustPreparation> custPreparationList) {
		this.custPreparationList = custPreparationList;
	}
	
}
