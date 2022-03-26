package br.com.carlosjunior.registrationlogin.services;


import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.repositories.OutdoorRepository;
 
import br.com.carlosjunior.registrationlogin.services.OutdoorInterface;

@Service
public class OutdoorServiceImpl implements OutdoorInterface
{
	
	 private OutdoorRepository OutdoorRespository;
	 
	 
 

	public OutdoorServiceImpl(OutdoorRepository OutdoorRespository) {
		super();
		this.OutdoorRespository = OutdoorRespository;
	}



	@Override
	public List<Outdoor> getAlloutdoor() {
		return OutdoorRespository.findAll();
	}



	@Override
	public Outdoor saveStudent(Outdoor std) {
		return OutdoorRespository.save(std);
	}

	@Override
	public Outdoor getStudentById(Long id) {
		// TODO Auto-generated method stub
		return OutdoorRespository.findById(id).get();
	}



	@Override
	public Outdoor updateStudent(Outdoor Outdoor) {
		// TODO Auto-generated method stub
		return OutdoorRespository.save(Outdoor);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		OutdoorRespository.deleteById(id);
		
	}
}
