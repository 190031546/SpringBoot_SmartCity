package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Hotel;
import br.com.carlosjunior.registrationlogin.entities.Indoor;
public interface HotelInterface 
{
	List<Hotel>getAllhotel();

	Hotel saveStudent(Hotel std);
	Hotel getStudentById(Long id);
	
	Hotel updateStudent(Hotel Hotel);
	
	void deleteStudentById(Long id);
}
