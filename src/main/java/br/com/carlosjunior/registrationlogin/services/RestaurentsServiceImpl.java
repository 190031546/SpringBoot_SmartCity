package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.entities.Restaurents;
import br.com.carlosjunior.registrationlogin.repositories.RestaurentsRepository;
import br.com.carlosjunior.registrationlogin.services.RestaurentsInterface;

@Service
public class RestaurentsServiceImpl implements RestaurentsInterface
{
  
   private RestaurentsRepository RestaurentsRespository;
  public RestaurentsServiceImpl(RestaurentsRepository RestaurentsRespository)
  {
    super();
    this.RestaurentsRespository=RestaurentsRespository;
  }
   
   

  @Override
  public List<Restaurents> getAllrestaurents() {
    return RestaurentsRespository.findAll();
  }

  @Override
  public Restaurents saveStudent(Restaurents std) {
     return RestaurentsRespository.save(std);
  }


	@Override
	public Restaurents getStudentById(Long id) {
		// TODO Auto-generated method stub
		return RestaurentsRespository.findById(id).get();
	}



	@Override
	public Restaurents updateStudent(Restaurents Restaurents) {
		// TODO Auto-generated method stub
		return RestaurentsRespository.save(Restaurents);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		RestaurentsRespository.deleteById(id);
		
	}
}