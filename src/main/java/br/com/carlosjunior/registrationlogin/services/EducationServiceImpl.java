package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Education;
import br.com.carlosjunior.registrationlogin.repositories.EducationRepository;
import br.com.carlosjunior.registrationlogin.services.EducationInterface;

@Service
public class EducationServiceImpl implements EducationInterface
{
  
   private EducationRepository educationRespository;
  public EducationServiceImpl(EducationRepository educationRespository)
  {
    super();
    this.educationRespository=educationRespository;
  }
   
   

  @Override
  public List<Education> getAlleducates() {
    return educationRespository.findAll();
  }

  @Override
  public Education saveStudent(Education std) {
     return educationRespository.save(std);
  }

}