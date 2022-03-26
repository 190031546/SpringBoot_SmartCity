package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.services.AjobInterface;
 
@Controller
public class AjobController
{
	
	private AjobInterface AjobService;
	
	public AjobController(AjobInterface AjobService) {
		super();
		this.AjobService= AjobService;
	}
	
	@GetMapping("/displayajob")
	public String listeducates(Model model)
	{
		model.addAttribute("Ajob", AjobService.getAllapllies());
		return "displayajob";
	}
	@GetMapping("/Ajob")
	public String listeducates1(Model model)
	{
		model.addAttribute("Ajob", AjobService.getAllapllies());
		return "job";
	}

	@PostMapping("/Ajob")
	public String saverecord(@ModelAttribute("Ajob") Ajob std)
	{
		AjobService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/Ajob/new")
	public String createstudenform(Model model)	
	{
		 
		Ajob ed=new Ajob();
		model.addAttribute("Ajob",ed);
		return "Ajob1";
 	
	}

	@GetMapping("/thankyouAjob")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	
	

	@GetMapping("/Ajob/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("Ajob", AjobService.getStudentById(id));
		return "editajob";
	}

	@PostMapping("/Ajob/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("Ajob") Ajob student,
			Model model) {
		
		// get student from database by id
		Ajob existingStudent = AjobService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setPosition(student.getPosition());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setNoofjobs(student.getNoofjobs());
		existingStudent.setPackage1(student.getPackage1());
		existingStudent.setEstab(student.getEstab());
		existingStudent.setJobname(student.getJobname());
		
		
		// save updated student object
		AjobService.updateStudent(existingStudent);
		return "redirect:/Ajob";		
	}
	
	@GetMapping("/Ajob/{id}")
	public String deleteStudent(@PathVariable Long id) {
		AjobService.deleteStudentById(id);
		return "redirect:/Ajob";
	}
	 

}
