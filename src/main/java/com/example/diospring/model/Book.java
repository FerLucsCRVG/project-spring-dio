package com.example.diospring.model;

import java.util.Objects;

public class Book {
	
	private Long id;
	private String name;
	private String category;
	private Integer cod;
	
	public Book(String name, String category, Long id) {
		super();
		this.name = name;
		this.category = category;
		this.id = id;
	}
	
	public Book() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getId() {
		return id;
	}
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", category=" + category + ", id=" + id + "]";
	}
	
	 
	
}
