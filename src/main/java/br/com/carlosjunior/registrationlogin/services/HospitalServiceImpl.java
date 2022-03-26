package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Hospital;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.repositories.HospitalRepository;
import br.com.carlosjunior.registrationlogin.services.HospitalInterface;

@Service
public class HospitalServiceImpl implements HospitalInterface
{
  
   private HospitalRepository HospitalRespository;
  public HospitalServiceImpl(HospitalRepository HospitalRespository)
  {
    super();
    this.HospitalRespository=HospitalRespository;
  }
   
   

  @Override
  public List<Hospital> getAllHospital() {
    return HospitalRespository.findAll();
  }

  @Override
  public Hospital saveStudent(Hospital std) {
     return HospitalRespository.save(std);
  }

  
  @Override
	public Hospital getStudentById(Long id) {
		// TODO Auto-generated method stub
		return HospitalRespository.findById(id).get();
	}



	@Override
	public Hospital updateStudent(Hospital Hospital) {
		// TODO Auto-generated method stub
		return HospitalRespository.save(Hospital);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		HospitalRespository.deleteById(id);
		
	}
}