package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ajob")
public class Ajob
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="jobname")
  private String jobname;
   

  @Column(name="location")
  private String location;
  
  @Column(name="position")
  private String position;
  @Column(name="package1")
  private String package1;
  @Column(name="noofjobs")
  private String noofjobs; 
  
  @Column(name="estab")
  private String estab;
  
  @Column(name="mobile")
  private String mobile;
  
  public Ajob()
  {
    
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getJobname() {
	return jobname;
}

public void setJobname(String jobname) {
	this.jobname = jobname;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getPackage1() {
	return package1;
}

public void setPackage1(String package1) {
	this.package1 = package1;
}

public String getNoofjobs() {
	return noofjobs;
}

public void setNoofjobs(String noofjobs) {
	this.noofjobs = noofjobs;
}

public String getEstab() {
	return estab;
}

public void setEstab(String estab) {
	this.estab = estab;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public Ajob(Long id, String jobname, String location, String position, String package1, String noofjobs, String estab,
		String mobile) {
	super();
	this.id = id;
	this.jobname = jobname;
	this.location = location;
	this.position = position;
	this.package1 = package1;
	this.noofjobs = noofjobs;
	this.estab = estab;
	this.mobile = mobile;
}
  
   

}