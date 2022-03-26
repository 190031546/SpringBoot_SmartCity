package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.services.IndoorInterface;
 
@Controller
public class IndoorController
{
	
	private IndoorInterface IndoorService;
	
	public IndoorController(IndoorInterface IndoorService) {
		super();
		this.IndoorService= IndoorService;
	}
	
	@GetMapping("/displayindoor")
	public String listeducates(Model model)
	{
		model.addAttribute("addIndoor", IndoorService.getAllindoor());
		return "displayindoor";
		
	}
	@GetMapping("/indoor")
	public String listeducates1(Model model)
	{
		model.addAttribute("addIndoor", IndoorService.getAllindoor());
		return "indoor";
		
	}
	@PostMapping("/addindoor")
	public String saverecord(@ModelAttribute("Indoor") Indoor std)
	{
		IndoorService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addIndoor/new")
	public String createstudenform(Model model)	
	{
		 
		Indoor ed=new Indoor();
		model.addAttribute("Indoor",ed);
		return "addindoor";
 	
	}

	@GetMapping("/thankyouindoor")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	
	@GetMapping("/addIndoor/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addIndoor", IndoorService.getStudentById(id));
		return "editedu";
	}

	@PostMapping("/addIndoor/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addIndoor") Indoor student,
			Model model) {
		
		// get student from database by id
		Indoor existingStudent = IndoorService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setEquipments(student.getEquipments());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setNop(student.getNop());
		existingStudent.setSportname(student.getSportname());
		
		
		// save updated student object
		IndoorService.updateStudent(existingStudent);
		return "redirect:/indoor";		
	}
	
	@GetMapping("/addIndoor/{id}")
	public String deleteStudent(@PathVariable Long id) {
		IndoorService.deleteStudentById(id);
		return "redirect:/indoor";
	}
}
