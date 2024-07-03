package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.DETAIL;
import static com.brijframework.inventory.contants.Constants.EOGLOBAL_MEDIA_DETAIL;
import static com.brijframework.inventory.contants.Constants.TYPE;
import static com.brijframework.inventory.contants.Constants.URL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_MEDIA_DETAIL)
public class EOGlobalMediaDetail extends EOEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name=TYPE)
	public String type;
	
	@Column(name=URL)
	public String url;
	
	@Column(name=DETAIL)
	@Lob
	public byte[] detail;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public byte[] getDetail() {
		return detail;
	}

	public void setDetail(byte[] detail) {
		this.detail = detail;
	}
	
	
	
}
