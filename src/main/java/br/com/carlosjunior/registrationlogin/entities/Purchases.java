package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addPurchases")
public class Purchases
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;	 

	@Column(name="area")
	private String area;
	
	@Column(name="price")
	private String price;

	@Column(name="noofplots")
	private String noofplots;
	
	@Column(name="mobile")
	private String mobile;
	public Purchases()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNoofplots() {
		return noofplots;
	}
	public void setNoofplots(String noofplots) {
		this.noofplots = noofplots;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Purchases(Long id, String name, String area, String price, String noofplots, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.price = price;
		this.noofplots = noofplots;
		this.mobile = mobile;
	}
	
	 
}

