package com.tarvin.transformers.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String itemName;
	private String itemType;
	private String itemLine;
	private double price;
	private boolean isBroken;
	private String description;
	public Item() {}
	public Item(String itemName, String itemType, String itemLine, double price, boolean isBroken, String description) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemLine = itemLine;
		this.price = price;
		this.isBroken = isBroken;
		this.description = description;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemLine() {
		return itemLine;
	}
	public void setItemLine(String itemLine) {
		this.itemLine = itemLine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isBroken() {
		return isBroken;
	}
	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
