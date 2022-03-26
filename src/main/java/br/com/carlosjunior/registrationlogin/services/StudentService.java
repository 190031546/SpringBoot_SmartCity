package br.com.carlosjunior.registrationlogin.services;
import java.util.List;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Student;
public interface StudentService 
{
	List<Student>getAllStudents();

	Student saveStudent(Student std);
	Student getStudentById(Long id);
	
	Student updateStudent(Student Student);
	
	void deleteStudentById(Long id);
}
