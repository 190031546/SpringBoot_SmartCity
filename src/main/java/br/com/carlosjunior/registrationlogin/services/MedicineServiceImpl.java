package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Hospital;
import br.com.carlosjunior.registrationlogin.entities.Medicine;
import br.com.carlosjunior.registrationlogin.repositories.MedicineRepository;
import br.com.carlosjunior.registrationlogin.services.MedicineInterface;

@Service
public class MedicineServiceImpl implements MedicineInterface
{
  
   private MedicineRepository MedicineRespository;
  public MedicineServiceImpl(MedicineRepository MedicineRespository)
  {
    super();
    this.MedicineRespository=MedicineRespository;
  }
   
   

  @Override
  public List<Medicine> getAllMedicine() {
    return MedicineRespository.findAll();
  }

  @Override
  public Medicine saveStudent(Medicine std) {
     return MedicineRespository.save(std);
  }
  
  @Override
	public Medicine getStudentById(Long id) {
		// TODO Auto-generated method stub
		return MedicineRespository.findById(id).get();
	}



	@Override
	public Medicine updateStudent(Medicine Medicine) {
		// TODO Auto-generated method stub
		return MedicineRespository.save(Medicine);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		MedicineRespository.deleteById(id);
		
	}

}