package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
public interface AjobInterface 
{
	List<Ajob>getAllapllies();

	Ajob saveStudent(Ajob std);
	Ajob getStudentById(Long id);
	
	Ajob updateStudent(Ajob Ajob);
	
	void deleteStudentById(Long id);
}
