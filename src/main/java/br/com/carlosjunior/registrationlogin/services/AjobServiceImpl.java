package br.com.carlosjunior.registrationlogin.services;


import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.repositories.AjobRepository;
 
import br.com.carlosjunior.registrationlogin.services.AjobInterface;

@Service
public class AjobServiceImpl implements AjobInterface
{
	
	 private AjobRepository AjobRespository;
	public AjobServiceImpl(AjobRepository AjobRespository)
	{
		super();
		this.AjobRespository=AjobRespository;
	}
 	
	 
 

	@Override
	public List<Ajob> getAllapllies() {
		return AjobRespository.findAll();
	}



	@Override
	public Ajob saveStudent(Ajob std) {
		return AjobRespository.save(std);
	}
	@Override
	public Ajob getStudentById(Long id) {
		// TODO Auto-generated method stub
		return AjobRespository.findById(id).get();
	}



	@Override
	public Ajob updateStudent(Ajob Ajob) {
		// TODO Auto-generated method stub
		return AjobRespository.save(Ajob);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		AjobRespository.deleteById(id);
		
	}

}
