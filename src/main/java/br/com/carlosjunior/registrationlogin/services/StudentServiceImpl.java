package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.entities.Student;
import br.com.carlosjunior.registrationlogin.repositories.StudentRepository;
import br.com.carlosjunior.registrationlogin.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
 	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

 
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

 

	@Override
	public Student saveStudent(Student std) {
		 return studentRepository.save(std);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student Student) {
		// TODO Auto-generated method stub
		return studentRepository.save(Student);
	}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	
	 
}
