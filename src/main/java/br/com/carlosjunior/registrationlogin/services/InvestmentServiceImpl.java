package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Investment;
import br.com.carlosjunior.registrationlogin.entities.Medicine;
import br.com.carlosjunior.registrationlogin.repositories.InvestmentRepository;
import br.com.carlosjunior.registrationlogin.services.InvestmentInterface;

@Service
public class InvestmentServiceImpl implements InvestmentInterface
{
  
   private InvestmentRepository InvestmentRespository;
  public InvestmentServiceImpl(InvestmentRepository InvestmentRespository)
  {
    super();
    this.InvestmentRespository=InvestmentRespository;
  }
   
   

  @Override
  public List<Investment> getAllInvestment() {
    return InvestmentRespository.findAll();
  }

  @Override
  public Investment saveStudent(Investment std) {
     return InvestmentRespository.save(std);
  }
  
  @Override
	public Investment getStudentById(Long id) {
		// TODO Auto-generated method stub
		return InvestmentRespository.findById(id).get();
	}



	@Override
	public Investment updateStudent(Investment Investment) {
		// TODO Auto-generated method stub
		return InvestmentRespository.save(Investment);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		InvestmentRespository.deleteById(id);
		
	}


}