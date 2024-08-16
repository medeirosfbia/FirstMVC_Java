package br.edu.bia.mvc.model;

import java.time.LocalDateTime;

public class Hello {
	// ATRIBUTOS
	
	private String name;
	private LocalDateTime date;
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return String.format("message: %s, date: %s\n", name, date);
	}
}
