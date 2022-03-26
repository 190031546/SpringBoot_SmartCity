package br.com.carlosjunior.registrationlogin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="psd")
	private String psd;
	
	@Column(name="cpsd")
	private String cpsd;
	
	@Column(name="mobile")
	private String mobile;
	
	public Student()
	{
		
	}
	
	public Student(String uname, String email, String psd, String cpsd, String mobile) {
		super();
		this.uname = uname;
		this.email = email;
		this.psd = psd;
		this.cpsd = cpsd;
		this.mobile = mobile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getCpsd() {
		return cpsd;
	}
	public void setCpsd(String cpsd) {
		this.cpsd = cpsd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
