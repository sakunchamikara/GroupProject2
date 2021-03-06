package com.WasteManagementSystem.Backend.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Outproduct")
public class OutReProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	@NotNull
	private String title;
	@NotNull
	private String category;
	// private String image1;

	@Column(name = "image1", length = 1000)
	private byte[] image1;

	private String image2;
	// @NotEmpty
	// @Min(10)
	@Column(name = "price", nullable = false)
	@NotNull

	@Range(min = 0)
	private float price;
	private String details;
	@NotNull
	private int quantity;
	private float discount;
	private Date date;
    private String customer;
    private String email;
    private float newprice;

	
	public OutReProduct() {
	}

	public OutReProduct(int id, String title, String category, byte[] image1, String image2, float price, float newprice, String details ,int quantity , float discount
			,Date date, String customer , String email) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.image1 = image1;
		this.image2 = image2;
		this.price = price;
		this.newprice = newprice;
		this.details = details;
		this.quantity = quantity ;
		this.discount = discount ;
        this.date = date;
      	this.customer = customer;
      	this.email = email;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public byte[] getImage1() {
		return image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	public float getnewprice() {
		return newprice;
	}

	public void setnewprice(float newprice) {
		this.newprice = newprice;
	}
	

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer =customer;
	}
	
	public String getEMail() {
		return email;
	}

	public void setEMail(String email) {
		this.email =email;
	}

}