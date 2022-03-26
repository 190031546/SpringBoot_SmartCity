package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Hospital;
import br.com.carlosjunior.registrationlogin.entities.Medicine;
public interface HospitalInterface 
{
	List<Hospital>getAllHospital();

	Hospital saveStudent(Hospital std);
	Hospital getStudentById(Long id);
	
	Hospital updateStudent(Hospital Hospital);
	
	void deleteStudentById(Long id);
}
