package com.brijframework.inventory.dto;

import java.util.Date;

public class UIInventoryManager {

	private Date busiDate;
	private boolean posted;
	private double totalCost;
	private double totalSales;
	private double theoreticalCost;
	private double totalInvValue;
	private long numWarnings;
	private long countFreq;
	private long custBusinessAppId;

	public Date getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(Date busiDate) {
		this.busiDate = busiDate;
	}

	public boolean isPosted() {
		return posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public double getTheoreticalCost() {
		return theoreticalCost;
	}

	public void setTheoreticalCost(double theoreticalCost) {
		this.theoreticalCost = theoreticalCost;
	}

	public double getTotalInvValue() {
		return totalInvValue;
	}

	public void setTotalInvValue(double totalInvValue) {
		this.totalInvValue = totalInvValue;
	}

	public long getNumWarnings() {
		return numWarnings;
	}

	public void setNumWarnings(long numWarnings) {
		this.numWarnings = numWarnings;
	}

	public long getCountFreq() {
		return countFreq;
	}

	public void setCountFreq(long countFreq) {
		this.countFreq = countFreq;
	}

	public long getCustBusinessAppId() {
		return custBusinessAppId;
	}

	public void setCustBusinessAppId(long custBusinessAppId) {
		this.custBusinessAppId = custBusinessAppId;
	}

}
