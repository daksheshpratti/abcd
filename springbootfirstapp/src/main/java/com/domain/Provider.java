package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "provider_visit")

public class Provider {
	
	
	@Id
    @Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="membership_type")
	private String membershipType;
	@Column(name="hospital_visits")
	private String hospitalVisits;
	@Column(name="customer_paid")
	private String customerPaid;
	@Column(name="insurance_claimed")
	private String insuranceClaimed;
	public String getInsuranceClaimed() {
		return insuranceClaimed;
	}

	public void setInsuranceClaimed(String insuranceClaimed) {
		this.insuranceClaimed = insuranceClaimed;
	}

	@Column(name="total_amount")
	private String totalAmount;
	
	
	public Provider() {
		super();
		
	}

	public Provider(int id, String firstName, String lastName, String membershipType, 
			String hospitalVisits, String customerPaid, String insuranceClaimed, 
			String totalAmount ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipType = membershipType;
		this.hospitalVisits = hospitalVisits;
		this.customerPaid = customerPaid;
		this.insuranceClaimed = insuranceClaimed;
		this.totalAmount = totalAmount;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getHospitalVisits() {
		return hospitalVisits;
	}

	public void setHospitalVisits(String hospitalVisits) {
		this.hospitalVisits = hospitalVisits;
		
	}
	
	public String getCustomerPaid() {
		return customerPaid;
	}

	public void setCustomerPaid(String customerPaid) {
		this.customerPaid = customerPaid;
		
	}
	
	
	
	
	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
		
	}
	

	
	
}