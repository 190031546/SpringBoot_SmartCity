package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Investment;
import br.com.carlosjunior.registrationlogin.entities.Purchases;
public interface PurchasesInterface 
{
	List<Purchases>getAllPurchases();

	Purchases saveStudent(Purchases std);
	Purchases getStudentById(Long id);
	
	Purchases updateStudent(Purchases Purchases);
	
	void deleteStudentById(Long id);
}
