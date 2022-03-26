package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
public interface OutdoorInterface 
{
	List<Outdoor>getAlloutdoor();

	Outdoor saveStudent(Outdoor std);
	 
Outdoor getStudentById(Long id);
	
	Outdoor updateStudent(Outdoor Outdoor);
	
	void deleteStudentById(Long id);
}
