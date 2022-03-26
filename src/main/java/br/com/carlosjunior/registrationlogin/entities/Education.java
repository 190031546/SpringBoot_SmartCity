package br.com.carlosjunior.registrationlogin.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="educate")
public class Education
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="sname")
  private String sname;
  
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getSname() {
    return sname;
  }


  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
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


  @Column(name="location")
  private String location;
  
  @Column(name="category")
  private String category;
  
  @Column(name="estab")
  private String estab;
  
  @Column(name="mobile")
  private String mobile;
  
  public Education()
  {
    
  }
  
  
  public Education(Long id, String sname, String location, String category, String estab, String mobile) {
    super();
    this.id = id;
    this.sname = sname;
    this.location = location;
    this.category = category;
    this.estab = estab;
    this.mobile = mobile;
  }

 
   

}