package com.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;	
	private float price;
	private Date publishDate;
	private int amount;
	@ManyToOne
	@JoinColumn(name = "author_id",nullable = false)
	private Author author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, Author author, float price, Date publishDate, int amount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
		this.amount = amount;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
