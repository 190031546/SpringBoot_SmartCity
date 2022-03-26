package br.com.carlosjunior.registrationlogin.services;
import java.util.*;

import br.com.carlosjunior.registrationlogin.entities.Applyedu;
public interface ApplyeduInterface 
{
	List<Applyedu>getAllapllies();

	Applyedu saveStudent(Applyedu std);
}
