package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Investment;
import br.com.carlosjunior.registrationlogin.entities.Purchases;
import br.com.carlosjunior.registrationlogin.repositories.PurchasesRepository;
import br.com.carlosjunior.registrationlogin.services.PurchasesInterface;

@Service
public class PurchasesServiceImpl implements PurchasesInterface
{
  
   private PurchasesRepository PurchasesRespository;
  public PurchasesServiceImpl(PurchasesRepository PurchasesRespository)
  {
    super();
    this.PurchasesRespository=PurchasesRespository;
  }
   
   

  @Override
  public List<Purchases> getAllPurchases() {
    return PurchasesRespository.findAll();
  }

  @Override
  public Purchases saveStudent(Purchases std) {
     return PurchasesRespository.save(std);
  }
  @Override
 	public Purchases getStudentById(Long id) {
 		// TODO Auto-generated method stub
 		return PurchasesRespository.findById(id).get();
 	}



 	@Override
 	public Purchases updateStudent(Purchases Purchases) {
 		// TODO Auto-generated method stub
 		return PurchasesRespository.save(Purchases);
 	}



 	@Override
 	public void deleteStudentById(Long id) {
 		// TODO Auto-generated method stub
 		PurchasesRespository.deleteById(id);
 		
 	}

}