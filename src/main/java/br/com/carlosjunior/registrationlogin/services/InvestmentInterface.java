package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Investment;
public interface InvestmentInterface 
{
	List<Investment>getAllInvestment();

	Investment saveStudent(Investment std);
	
	Investment getStudentById(Long id);
	
	Investment updateStudent(Investment Investment);
	
	void deleteStudentById(Long id);
}
