package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addRestaurents")
public class Restaurents
{
	public Restaurents(Long id, String resname, String spelitem, String location, String type, String mobile) {
		super();
		this.id = id;
		this.resname = resname;
		this.spelitem = spelitem;
		this.location = location;
		this.type = type;
		this.mobile = mobile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResname() {
		return resname;
	}
	public void setResname(String resname) {
		this.resname = resname;
	}
	public String getSpelitem() {
		return spelitem;
	}
	public void setSpelitem(String spelitem) {
		this.spelitem = spelitem;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="resname")
	private String resname;	 

	@Column(name="spelitem")
	private String spelitem;
	
	@Column(name="location")
	private String location;

	@Column(name="type")
	private String type;
	
	@Column(name="mobile")
	private String mobile;
	public Restaurents()
	{
		
	}
	 
}

