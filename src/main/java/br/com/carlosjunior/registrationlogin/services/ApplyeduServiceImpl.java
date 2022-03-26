package br.com.carlosjunior.registrationlogin.services;


import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Applyedu;
import br.com.carlosjunior.registrationlogin.repositories.ApplyeduRepository;
 
import br.com.carlosjunior.registrationlogin.services.ApplyeduInterface;

@Service
public class ApplyeduServiceImpl implements ApplyeduInterface
{
	
	 private ApplyeduRepository ApplyeduRespository;
	public ApplyeduServiceImpl(ApplyeduRepository ApplyeduRespository)
	{
		super();
		this.ApplyeduRespository=ApplyeduRespository;
	}
 	
	 
 

	@Override
	public List<Applyedu> getAllapllies() {
		return ApplyeduRespository.findAll();
	}



	@Override
	public Applyedu saveStudent(Applyedu std) {
		return ApplyeduRespository.save(std);
	}

}
