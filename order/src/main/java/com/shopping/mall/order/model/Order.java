package com.shopping.mall.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {

	private long id;
	private String customerName;
	private String items;
	private String totalPrice;
	
	public Order() {
		
	}
	
	public Order(String customerName, String items, String totalPrice) {
		this.customerName = customerName;
		this.items = items;
		this.totalPrice = totalPrice;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "customer_name", nullable = false)
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(name = "items", nullable = false)
	public String getitems() {
		return items;
	}
	public void setitems(String items) {
		this.items = items;
	}
	
	@Column(name = "total_price", nullable = false)
	public String gettotalPrice() {
		return totalPrice;
	}
	public void settotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerName=" + customerName + ", items=" + items + ", totalPrice=" + totalPrice
				+ "]";
	}

	
	
}