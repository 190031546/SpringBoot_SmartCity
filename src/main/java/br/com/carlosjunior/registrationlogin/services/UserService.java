package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import br.com.carlosjunior.registrationlogin.entities.User;
import br.com.carlosjunior.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	List<User>getAllStudents();
	User saveStudent(User std);
	User save(UserRegistrationDto registrationDto);
	
}
