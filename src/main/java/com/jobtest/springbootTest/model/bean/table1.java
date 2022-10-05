package com.jobtest.springbootTest.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Table1")
public class Table1 {

	public Table1() {
		super();
	}
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param pro_name
	 * @param pro_num
	 * @param pro_price
	 */
	public Table1(Integer id, String name, int age, String pro_name, String pro_num, String pro_price) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.pro_name = pro_name;
		this.pro_num = pro_num;
		this.pro_price = pro_price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "pro_name")
	private String pro_name;
	
	@Column(name = "pro_num")
	private String pro_num;
	
	@Column(name = "pro_price")
	private String pro_price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_num() {
		return pro_num;
	}

	public void setPro_num(String pro_num) {
		this.pro_num = pro_num;
	}

	public String getPro_price() {
		return pro_price;
	}

	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}

}