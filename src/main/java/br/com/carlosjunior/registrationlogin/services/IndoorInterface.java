package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
public interface IndoorInterface 
{
	List<Indoor>getAllindoor();

	Indoor saveStudent(Indoor std);
	
Indoor getStudentById(Long id);
	
	Indoor updateStudent(Indoor Indoor);
	
	void deleteStudentById(Long id);
}
