package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addHotel")
public class Hotel
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="hotelname")
	private String hotelname;	 

	@Column(name="luxury")
	private String luxury;
	
	@Column(name="location")
	private String location;

	@Column(name="noofbeds")
	private String noofbeds;
	@Column(name="mobile")
	private String mobile;
	public Hotel()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getLuxury() {
		return luxury;
	}
	public void setLuxury(String luxury) {
		this.luxury = luxury;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNoofbeds() {
		return noofbeds;
	}
	public void setNoofbeds(String noofbeds) {
		this.noofbeds = noofbeds;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Hotel(Long id, String hotelname, String luxury, String location, String noofbeds, String mobile) {
		super();
		this.id = id;
		this.hotelname = hotelname;
		this.luxury = luxury;
		this.location = location;
		this.noofbeds = noofbeds;
		this.mobile = mobile;
	}
	 
	
 
	 

}

