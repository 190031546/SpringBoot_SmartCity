package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Medicine;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
public interface MedicineInterface 
{
	List<Medicine>getAllMedicine();

	Medicine saveStudent(Medicine std);
	Medicine getStudentById(Long id);
	
	Medicine updateStudent(Medicine Medicine);
	
	void deleteStudentById(Long id);
}
