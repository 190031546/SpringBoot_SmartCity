package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Investment;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.services.InvestmentInterface;
 
@Controller
public class InvestmentController
{
	
	private InvestmentInterface InvestmentService;
	
	public InvestmentController(InvestmentInterface InvestmentService) {
		super();
		this.InvestmentService= InvestmentService;
	}
	
	@GetMapping("/displayinvestments")
	public String listeducates(Model model)
	{
		model.addAttribute("addInvestment", InvestmentService.getAllInvestment());
		return "displayinvestments";
		
	}

	@GetMapping("/investment")
	public String listeducates1(Model model)
	{
		model.addAttribute("addInvestment", InvestmentService.getAllInvestment());
		return "investment";
		
	}
	@PostMapping("/addInvestment")
	public String saverecord(@ModelAttribute("Investment") Investment std)
	{
		InvestmentService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addInvestment/new")
	public String createstudenform(Model model)	
	{
		 
		Investment ed=new Investment();
		model.addAttribute("Investment",ed);
		return "addinvestment";
 	
	}

	@GetMapping("/thankyouInvestment")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	

	@GetMapping("/addInvestment/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addInvestment", InvestmentService.getStudentById(id));
		return "editinvestment";
	}

	@PostMapping("/addInvestment/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addInvestment") Investment student,
			Model model) {
		
		// get student from database by id
		Investment existingStudent = InvestmentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setArea(student.getArea());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setNoofplots(student.getNoofplots());
		existingStudent.setPrice(student.getPrice());
		
		
		// save updated student object
		InvestmentService.updateStudent(existingStudent);
		return "redirect:/investment";		
	}
	
	@GetMapping("/addInvestment/{id}")
	public String deleteStudent(@PathVariable Long id) {
		InvestmentService.deleteStudentById(id);
		return "redirect:/investment";
	}

	 

}
