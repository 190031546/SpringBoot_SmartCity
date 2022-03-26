package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Job;
public interface JobService
{
	List<Job>getAlljobs();

	Job saveJobs(Job job);
	Job getStudentById(Long id);
	
	Job updateStudent(Job Job);
	
	void deleteStudentById(Long id);
}
