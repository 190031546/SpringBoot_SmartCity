package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

}
