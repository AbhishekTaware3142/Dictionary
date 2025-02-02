package com.example.web;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Di")

public class Dictionary {
	@Id
	private Integer id;
	private String word;
	private String mean;
	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dictionary(Integer id, String word, String mean) {
		super();
		this.id = id;
		this.word = word;
		this.mean = mean;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary other = (Dictionary) obj;
		return Objects.equals(id, other.id) && Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	@Override
	public String toString() {
		return "Dictionary [id=" + id + ", word=" + word + ", mean=" + mean + "]";
	}
	
	
}