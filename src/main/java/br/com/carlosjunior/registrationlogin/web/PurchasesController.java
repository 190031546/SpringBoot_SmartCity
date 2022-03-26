package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Investment;
import br.com.carlosjunior.registrationlogin.entities.Purchases;
import br.com.carlosjunior.registrationlogin.services.PurchasesInterface;
 
@Controller
public class PurchasesController
{
	
	private PurchasesInterface PurchasesService;
	
	public PurchasesController(PurchasesInterface PurchasesService) {
		super();
		this.PurchasesService= PurchasesService;
	}
	
	@GetMapping("/displaypurchases")
	public String listeducates(Model model)
	{
		model.addAttribute("addPurchases", PurchasesService.getAllPurchases());
		return "displaypurchases";
		
	}

	@GetMapping("/purchases")
	public String listeducates1(Model model)
	{
		model.addAttribute("addPurchases", PurchasesService.getAllPurchases());
		return "purchases";
		
	}
	@PostMapping("/addPurchases")
	public String saverecord(@ModelAttribute("Purchases") Purchases std)
	{
		PurchasesService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addPurchases/new")
	public String createstudenform(Model model)	
	{
		 
		Purchases ed=new Purchases();
		model.addAttribute("Purchases",ed);
		return "addpurchases";
 	
	}

	@GetMapping("/thankyouPurchases")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	 
	@GetMapping("/addPurchases/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addPurchases", PurchasesService.getStudentById(id));
		return "editpurchases";
	}

	@PostMapping("/addPurchases/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addPurchases") Purchases student,
			Model model) {
		
		// get student from database by id
		Purchases existingStudent = PurchasesService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setArea(student.getArea());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setNoofplots(student.getNoofplots());
		existingStudent.setPrice(student.getPrice());
		
		
		// save updated student object
		PurchasesService.updateStudent(existingStudent);
		return "redirect:/purchases";		
	}
	
	@GetMapping("/addPurchases/{id}")
	public String deleteStudent(@PathVariable Long id) {
		PurchasesService.deleteStudentById(id);
		return "redirect:/purchases";
	}

	 


}
