/**
 * 
 */
package com.suwin.spring.boot.mobile.service.domain;

/**
 * @author Murthy
 *
 */
public class Mobile {
	private int id;
	private String name;
	private String status;
	private String lob;
	private String publicateDate;
	private String countryCode;
	private double price;
	private String accessoryType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getPublicateDate() {
		return publicateDate;
	}
	public void setPublicateDate(String publicateDate) {
		this.publicateDate = publicateDate;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAccessoryType() {
		return accessoryType;
	}
	public void setAccessoryType(String accessoryType) {
		this.accessoryType = accessoryType;
	}
	
	
}
