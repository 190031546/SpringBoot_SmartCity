package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Hotel;
import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.repositories.HotelRepository;
import br.com.carlosjunior.registrationlogin.services.HotelInterface;

@Service
public class HotelServiceImpl implements HotelInterface
{
  
   private HotelRepository HotelRespository;
  public HotelServiceImpl(HotelRepository HotelRespository)
  {
    super();
    this.HotelRespository=HotelRespository;
  }
   
   

  @Override
  public List<Hotel> getAllhotel() {
    return HotelRespository.findAll();
  }

  @Override
  public Hotel saveStudent(Hotel std) {
     return HotelRespository.save(std);
  }

	@Override
	public Hotel getStudentById(Long id) {
		// TODO Auto-generated method stub
		return HotelRespository.findById(id).get();
	}



	@Override
	public Hotel updateStudent(Hotel Hotel) {
		// TODO Auto-generated method stub
		return HotelRespository.save(Hotel);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		HotelRespository.deleteById(id);
		
	}


}