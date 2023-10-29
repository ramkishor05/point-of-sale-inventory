package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.DESC;
import static com.brijframework.inventory.contants.Constants.GLB_IMG_ID;
import static com.brijframework.inventory.contants.Constants.IDEN_NO;
import static com.brijframework.inventory.contants.Constants.LOGO_URL;
import static com.brijframework.inventory.contants.Constants.NAME;
import static com.brijframework.inventory.contants.Constants.TYPE_ID;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class EOCustItem extends EOCustObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name=IDEN_NO)
	private String idenNo;
	
	@Column(name=NAME)
	private String name;
	
	@Column(name=LOGO_URL)
	private String logoUrl;
	
	@Column(name=DESC)
	private String desc;
	
	@Column(name=TYPE_ID)
	private String typeId;
	
	@OneToOne
	@JoinColumn(name = GLB_IMG_ID, nullable = true)
	public EOGlobalMediaDetail glbImgDetail;
	

	public String logURL() {
		return this.glbImgDetail != null ? this.glbImgDetail.url : "";
	}

	public EOGlobalMediaDetail getGlbImgDetail() {
		return glbImgDetail;
	}

	public void setGlbImgDetail(EOGlobalMediaDetail glbImgDetail) {
		this.glbImgDetail = glbImgDetail;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	@Lob
	private String instructions;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

}
