package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.entities.Restaurents;
public interface RestaurentsInterface 
{
	List<Restaurents>getAllrestaurents();

	Restaurents saveStudent(Restaurents std);
	Restaurents getStudentById(Long id);
	
	Restaurents updateStudent(Restaurents Restaurents);
	
	void deleteStudentById(Long id);
}
