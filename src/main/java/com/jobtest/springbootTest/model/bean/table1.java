package com.jobtest.springbootTest.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table1")
public class table1 {

	public table1() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idx")
	private Integer idx;
	
	@Column(name = "c_aes256")
	private String c_aes256;
	
	@Column(name = "c_base64")
	private String c_base64;

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getC_aes256() {
		return c_aes256;
	}

	public void setC_aes256(String c_aes256) {
		this.c_aes256 = c_aes256;
	}

	public String getC_base64() {
		return c_base64;
	}

	public void setC_base64(String c_base64) {
		this.c_base64 = c_base64;
	}

	
	
	
}
