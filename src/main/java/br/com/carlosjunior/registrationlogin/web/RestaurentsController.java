package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Restaurents;
import br.com.carlosjunior.registrationlogin.services.RestaurentsInterface;
 
@Controller
public class RestaurentsController
{
	
	private RestaurentsInterface RestaurentsService;
	
	public RestaurentsController(RestaurentsInterface RestaurentsService) {
		super();
		this.RestaurentsService= RestaurentsService;
	}
	
	@GetMapping("/displayrestaurents")
	public String listeducates(Model model)
	{
		model.addAttribute("addRestaurents", RestaurentsService.getAllrestaurents());
		return "displayrestarents";
		
	}
	@GetMapping("/food")
	public String listeducates1(Model model)
	{
		model.addAttribute("addRestaurents", RestaurentsService.getAllrestaurents());
		return "food";
		
	}
	@PostMapping("/addRestaurents")
	public String saverecord(@ModelAttribute("Restaurents") Restaurents std)
	{
		RestaurentsService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addRestaurents/new")
	public String createstudenform(Model model)	
	{
		 
		Restaurents ed=new Restaurents();
		model.addAttribute("Restaurents",ed);
		return "addrestarants";
 	
	}

	@GetMapping("/thankyouRestaurents")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	

	@GetMapping("/addRestaurents/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addRestaurents", RestaurentsService.getStudentById(id));
		return "editfood";
	}

	@PostMapping("/addRestaurents/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addRestaurents") Restaurents student,
			Model model) {
		
		// get student from database by id
		Restaurents existingStudent = RestaurentsService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setResname(student.getResname());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setSpelitem(student.getSpelitem());
		existingStudent.setType(student.getType());
		
		
		// save updated student object
		RestaurentsService.updateStudent(existingStudent);
		return "redirect:/food";		
	}
	
	@GetMapping("/addRestaurents/{id}")
	public String deleteStudent(@PathVariable Long id) {
		RestaurentsService.deleteStudentById(id);
		return "redirect:/food";
	}
	 

}
