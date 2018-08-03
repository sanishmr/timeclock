package com.santest.timeclock.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.databind.jsonFormatVisitors.

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Clock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clock_id;
	
	
	private String clock_name;
	private String clock_type;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yy")
	private Date clock_add_date;
	private String store_number;

	public String getClock_name() {
		return clock_name;
	}
	public void setClock_name(String clock_name) {
		this.clock_name = clock_name;
	}
	public String getClock_type() {
		return clock_type;
	}
	public void setClock_type(String clock_type) {
		this.clock_type = clock_type;
	}
	public Date getClock_add_date() {
		return clock_add_date;
	}
	public void setClock_add_date(Date clock_add_date) {
		this.clock_add_date = clock_add_date;
	}
	public String getStore_no() {
		return store_number;
	}
	public void setStore_no(String store_no) {
		this.store_number = store_no;
	}
	public Long getClock_id() {
		return clock_id;
	}
	public void setClock_id(Long clock_id) {
		this.clock_id = clock_id;
	}
	
}
