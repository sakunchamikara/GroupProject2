package com.WasteManagementSystem.Backend.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "customerFeedback")
public class CustomerFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;
    @NotNull
    private String feedbackType;
    @NotNull
	private String cusFeedFirstName;
	@NotNull
	private String cusFeedLastName;
	@NotNull
	private String cusFeedAddress;
	 @NotNull
	private int cusFeedConactNum;
	 @NotNull
		private String email;
	 @NotNull
		private String feedback;
	 @NotNull
		private Date date;
	 @NotNull
		private String status;
	 
	 
	


	public CustomerFeedback(){

	}
    public CustomerFeedback(int id, String feedbackType, String cusFeedFirstName,String cusFeedLastName,String cusFeedAddress, int cusFeedConactNum, String email, String feedback, Date date, String status){
        super();
        this.id = id;
		this.feedbackType = feedbackType ;
		this.cusFeedFirstName = cusFeedFirstName;
		this.cusFeedLastName = cusFeedLastName;
		this.cusFeedAddress = cusFeedAddress;
		this.cusFeedConactNum = cusFeedConactNum;
		this.email = email;
		this.feedback = feedback;
		this.date = date;
		this.status = status;
		
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(String feedbackType) {
		this.feedbackType =feedbackType;
	}
	
	public String getCusFeedFirstName() {
		return cusFeedFirstName;
	}

	public void setCusFeedFirstName(String cusFeedFirstName) {
		this.cusFeedFirstName = cusFeedFirstName;
	}
	

	public String getCusFeedLastName() {
		return cusFeedLastName;
	}

	public void setCusFeedLastName(String cusFeedLastName) {
		this.cusFeedLastName =cusFeedLastName;
	}
	
	public String getCusFeedAddress() {
		return cusFeedAddress;
	}

	public void setCusFeedAddress(String cusFeedAddress) {
		this.cusFeedAddress =cusFeedAddress;
	}
	
	public int getCusFeedConactNum() {
		return cusFeedConactNum;
	}

	public void setCusFeedConactNum(int cusFeedConactNum) {
		this.cusFeedConactNum = cusFeedConactNum;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email =email;
	}
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback =feedback;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}