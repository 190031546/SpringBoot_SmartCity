package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addMedicine")
public class Medicine
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="medicinename")
	private String medicinename;	 

	@Column(name="availabletime")
	private String availabletime;
	
	@Column(name="location")
	private String location;
	
	@Column(name="expdate")
	private String expdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Medicine(Long id, String medicinename, String availabletime, String location, String expdate,
			String importfrom, String mobile) {
		super();
		this.id = id;
		this.medicinename = medicinename;
		this.availabletime = availabletime;
		this.location = location;
		this.expdate = expdate;
		this.importfrom = importfrom;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public String getAvailabletime() {
		return availabletime;
	}

	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getImportfrom() {
		return importfrom;
	}

	public void setImportfrom(String importfrom) {
		this.importfrom = importfrom;
	}


	@Column(name="importfrom")
	private String importfrom;

	
	public Medicine()
	{
		
	}

	 
}

