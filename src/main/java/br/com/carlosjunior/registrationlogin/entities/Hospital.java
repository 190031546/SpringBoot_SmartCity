package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addHospital")
public class Hospital
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="hospitalname")
	private String hospitalname;	 

	@Column(name="services")
	private String services;
	
	@Column(name="location")
	private String location;
	
	@Column(name="qualifications")
	private String qualifications;

	@Column(name="specialist")
	private String specialist;
	
	@Column(name="mobile")
	private String mobile;
	
	public Hospital()
	{
		
	}

	public Hospital(Long id, String hospitalname, String services, String location, String qualifications,
			String specialist, String mobile) {
		super();
		this.id = id;
		this.hospitalname = hospitalname;
		this.services = services;
		this.location = location;
		this.qualifications = qualifications;
		this.specialist = specialist;
		this.mobile = mobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

