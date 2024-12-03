package com.Eci.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {
	@Id
	private int house_no;
	private int pin_code;
	private String cityname;

	public Address() {
		super();
	}

	public Address(int house_no, int pin_code, String cityname) {
		super();
		this.house_no = house_no;
		this.pin_code = pin_code;
		this.cityname = cityname;
	}

	/**
	 * @return the house_no
	 */
	public int getHouse_no() {
		return house_no;
	}

	/**
	 * @param house_no the house_no to set
	 */
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	/**
	 * @return the pin_code
	 */
	public int getPin_code() {
		return pin_code;
	}

	/**
	 * @param pin_code the pin_code to set
	 */
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	/**
	 * @return the cityname
	 */
	public String getCityname() {
		return cityname;
	}

	/**
	 * @param cityname the cityname to set
	 */
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [pin_code=" + pin_code + ", cityname=" + cityname + "]";
	}

}
