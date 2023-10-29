package com.brijframework.inventory.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class UICustPreparation implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;
	private double qnt;
	private long glbImgDetailId;

	private Long custBusinessAppId;

	public List<UIPrepLocation> custPreparationLocationList;

	public List<UIPrepCountFreq> custPreparationLCountFreqList;

	public Set<UIPrepRecipe> custPreparationLRecipeList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQnt() {
		return qnt;
	}

	public void setQnt(double qnt) {
		this.qnt = qnt;
	}

	public long getGlbImgDetailId() {
		return glbImgDetailId;
	}

	public void setGlbImgDetailId(long glbImgDetailId) {
		this.glbImgDetailId = glbImgDetailId;
	}

	public Long getCustBusinessAppId() {
		return custBusinessAppId;
	}

	public void setCustBusinessAppId(Long custBusinessAppId) {
		this.custBusinessAppId = custBusinessAppId;
	}

	public List<UIPrepLocation> getCustPreparationLocationList() {
		return custPreparationLocationList;
	}

	public void setCustPreparationLocationList(List<UIPrepLocation> custPreparationLocationList) {
		this.custPreparationLocationList = custPreparationLocationList;
	}

	public List<UIPrepCountFreq> getCustPreparationLCountFreqList() {
		return custPreparationLCountFreqList;
	}

	public void setCustPreparationLCountFreqList(List<UIPrepCountFreq> custPreparationLCountFreqList) {
		this.custPreparationLCountFreqList = custPreparationLCountFreqList;
	}

	public Set<UIPrepRecipe> getCustPreparationLRecipeList() {
		return custPreparationLRecipeList;
	}

	public void setCustPreparationLRecipeList(Set<UIPrepRecipe> custPreparationLRecipeList) {
		this.custPreparationLRecipeList = custPreparationLRecipeList;
	}

}
