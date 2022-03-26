package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Job;
import br.com.carlosjunior.registrationlogin.services.JobService;
 

@Controller
public class JobController
{
	
	private JobService jobService;
	
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/jobs")
	public String listjobs(Model model)
	{
		model.addAttribute("jobs", jobService.getAlljobs());
		return "jobs";
		
	}
	
  
 
	
	 
	@PostMapping("/jobb")
	public String saverecord(@ModelAttribute("jobs") Job job)
	{
		jobService.saveJobs(job);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/job/new")
	public String createstudenform(Model model)	
	{
		 
		Job ed=new Job();
		model.addAttribute("jobs",ed);
		return "applyjob";
 	
	}

	@GetMapping("/hire")
	public String hire(Model model)	
	{
		 
	 
		return "hire";
 	
	}
	


	@GetMapping("/Job/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("Job", jobService.getStudentById(id));
		return "editjob";
	}

	@PostMapping("/Job/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("Job") Job student,
			Model model) {
		
		// get student from database by id
		Job existingStudent = jobService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFname(student.getFname());
		existingStudent.setLname(student.getLname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPosition(student.getPosition());
		existingStudent.setPort(student.getPort());
		existingStudent.setSalary(student.getSalary());
		existingStudent.setStart(student.getStart());
		existingStudent.setLast(student.getLast());
		existingStudent.setComment(student.getComment());
		
		
		// save updated student object
		jobService.updateStudent(existingStudent);
		return "redirect:/jobs";		
	}
	
	@GetMapping("/Job/{id}")
	public String deleteStudent(@PathVariable Long id) {
		jobService.deleteStudentById(id);
		return "redirect:/jobs";
	}

}
