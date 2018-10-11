package com.slickarc.hb.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Table(name="CUSTOMER_MASTER")
public class Customer {
	@Id
	@Column(name="CUSTOMER_ID")
	@Getter
	public int customerId;
	
	@Column(name="CUSTOMER_FIRST_NAME")
	public String firstName;
	
	@Column(name="CUSTOMER_LAST_NAME")
	public String lastName;
	
	@Column(name="CUSTOMER_STATUS_CODE")
	public String status;
}
