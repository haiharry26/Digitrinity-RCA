package com.digitrinity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faultcategorymaster")
public class FaultCategoryMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String faultID;
	
	@Column(name = "FaultCategory")
	private String faultCategory;

	public String getFaultID() {
		return faultID;
	}

	public void setFaultID(String faultID) {
		this.faultID = faultID;
	}

	public String getFaultCategory() {
		return faultCategory;
	}

	public void setFaultCategory(String faultCategory) {
		this.faultCategory = faultCategory;
	}

	
}
