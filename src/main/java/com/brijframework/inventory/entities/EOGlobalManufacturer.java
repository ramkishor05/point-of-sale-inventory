package com.brijframework.inventory.entities;

import static com.brijframework.inventory.contants.Constants.BRAND;
import static com.brijframework.inventory.contants.Constants.EOGLOBAL_MANUFACTURER;
import static com.brijframework.inventory.contants.Constants.GTIN;
import static com.brijframework.inventory.contants.Constants.MPN;
import static com.brijframework.inventory.contants.Constants.NAME;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = EOGLOBAL_MANUFACTURER, uniqueConstraints = { @UniqueConstraint(columnNames = { NAME }) })
public class EOGlobalManufacturer extends EOEntityObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name = BRAND)
	private String brand;

	@Column(name = GTIN)
	private String gtin; // Global Trade Item Number (GTIN) of the item

	@Column(name = MPN)
	private String mpn; // Manufacturer Part Number (MPN) of the item

	@Column(name = NAME)
	private String name;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGtin() {
		return gtin;
	}

	public void setGtin(String gtin) {
		this.gtin = gtin;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
