package com.ivan.geng.onlinesmsservice;

public class PhoneInfo {

	private String id;
	private String country;
	private String phoneNumber;
	private String addedTime;
	private String detailUrl;

	public PhoneInfo() {
	}

	public PhoneInfo(String id, String country, String phoneNumber, String addedTime, String detailUrl) {
		super();
		this.id = id;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.addedTime = addedTime;
		this.detailUrl = detailUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddedTime() {
		return addedTime;
	}

	public void setAddedTime(String addedTime) {
		this.addedTime = addedTime;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

}
