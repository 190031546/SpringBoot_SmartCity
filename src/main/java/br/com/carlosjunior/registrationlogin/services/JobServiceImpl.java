package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Job;
import br.com.carlosjunior.registrationlogin.repositories.JobRepository;
 
@Service
public class JobServiceImpl implements JobService
{
	
	 private JobRepository jobRespository;
	public JobServiceImpl(JobRepository jobRespository)
	{
		super();
		this.jobRespository=jobRespository;
	}
	@Override
	public List<Job> getAlljobs() {
		// TODO Auto-generated method stub
		return jobRespository.findAll();
	}
	@Override
	public Job saveJobs(Job job) {
		// TODO Auto-generated method stub
		return jobRespository.save(job);
	}
 	
	@Override
	public Job getStudentById(Long id) {
		// TODO Auto-generated method stub
		return jobRespository.findById(id).get();
	}



	@Override
	public Job updateStudent(Job Job) {
		// TODO Auto-generated method stub
		return jobRespository.save(Job);
	}



	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		jobRespository.deleteById(id);
		
	}
	 
 

}
