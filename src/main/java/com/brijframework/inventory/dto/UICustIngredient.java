package com.brijframework.inventory.dto;

import java.io.Serializable;
import java.util.List;

public class UICustIngredient implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String idenNo;
	private String name;
	private String logoUrl;
	private String description;

	private long custCategoryId;
	private long custBaseUnitId;
	private long custReptUnitId;
	private long glbImgDetailId;
	private long custBusinessAppId;

	private List<UIIngrLocation> custLocationList;

	private List<UIIngrCountFreq> custCountFreqList;

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

	public long getCustCategoryId() {
		return custCategoryId;
	}

	public void setCustCategoryId(long custCategoryId) {
		this.custCategoryId = custCategoryId;
	}

	public long getCustBaseUnitId() {
		return custBaseUnitId;
	}

	public void setCustBaseUnitId(long custBaseUnitId) {
		this.custBaseUnitId = custBaseUnitId;
	}

	public long getCustReptUnitId() {
		return custReptUnitId;
	}

	public void setCustReptUnitId(long custReptUnitId) {
		this.custReptUnitId = custReptUnitId;
	}

	public long getGlbImgDetailId() {
		return glbImgDetailId;
	}

	public void setGlbImgDetailId(long glbImgDetailId) {
		this.glbImgDetailId = glbImgDetailId;
	}

	public long getCustBusinessAppId() {
		return custBusinessAppId;
	}

	public void setCustBusinessAppId(long custBusinessAppId) {
		this.custBusinessAppId = custBusinessAppId;
	}

	public List<UIIngrLocation> getCustLocationList() {
		return custLocationList;
	}

	public void setCustLocationList(List<UIIngrLocation> custLocationList) {
		this.custLocationList = custLocationList;
	}

	public List<UIIngrCountFreq> getCustCountFreqList() {
		return custCountFreqList;
	}

	public void setCustCountFreqList(List<UIIngrCountFreq> custCountFreqList) {
		this.custCountFreqList = custCountFreqList;
	}
}
