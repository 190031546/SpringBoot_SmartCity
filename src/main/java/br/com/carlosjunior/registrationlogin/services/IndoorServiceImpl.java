package br.com.carlosjunior.registrationlogin.services;


import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.repositories.IndoorRepository;
 
import br.com.carlosjunior.registrationlogin.services.IndoorInterface;

@Service
public class IndoorServiceImpl implements IndoorInterface
{
	
	 private IndoorRepository IndoorRespository;
	 
	 
 

	public IndoorServiceImpl(IndoorRepository IndoorRespository) {
		super();
		this.IndoorRespository = IndoorRespository;
	}



	@Override
	public List<Indoor> getAllindoor() {
		return IndoorRespository.findAll();
	}



	@Override
	public Indoor saveStudent(Indoor std) {
		// TODO Auto-generated method stub
		return IndoorRespository.save(std);
	}



	@Override
	public Indoor getStudentById(Long id) {
		// TODO Auto-generated method stub
		return IndoorRespository.findById(id).get();
	}



	@Override
	public Indoor updateStudent(Indoor Indoor) {
		// TODO Auto-generated method stub
		return IndoorRespository.save(Indoor);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		IndoorRespository.deleteById(id);
		
	}


}
