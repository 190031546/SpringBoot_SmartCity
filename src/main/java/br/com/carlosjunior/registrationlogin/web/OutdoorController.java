package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.services.OutdoorInterface;
 
@Controller
public class OutdoorController
{
	
	private OutdoorInterface OutdoorService;
	
	public OutdoorController(OutdoorInterface OutdoorService) {
		super();
		this.OutdoorService= OutdoorService;
	}
	
	@GetMapping("/displayoutdoor")
	public String listeducates(Model model)
	{
		model.addAttribute("addOutdoor", OutdoorService.getAlloutdoor());
		return "displayoutdoor";
		
	}
	@GetMapping("/outdoor")
	public String listeducates1(Model model)
	{
		model.addAttribute("addOutdoor", OutdoorService.getAlloutdoor());
		return "outdoor";
		
	}
	
	 
	@PostMapping("/addoutdoor")
	public String saverecord(@ModelAttribute("addOutdoor") Outdoor std)
	{
		OutdoorService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	@GetMapping("/addoutdoor/new")
	public String createstudenform(Model model)	
	{
		 
		Outdoor ed=new Outdoor();
		model.addAttribute("addOutdoor",ed);
		return "addoutdoor";
 	
	}

	@GetMapping("/thankyououtdoor")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	 
	
	@GetMapping("/addOutdoor/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addOutdoor", OutdoorService.getStudentById(id));
		return "editedu1";
	}

	@PostMapping("/addOutdoor/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addOutdoor") Outdoor student,
			Model model) {
		
		// get student from database by id
		Outdoor existingStudent = OutdoorService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setEquipments(student.getEquipments());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setNop(student.getNop());
		existingStudent.setSportname(student.getSportname());
		
		
		// save updated student object
		OutdoorService.updateStudent(existingStudent);
		return "redirect:/outdoor";		
	}
	
	@GetMapping("/addOutdoor/{id}")
	public String deleteStudent(@PathVariable Long id) {
		OutdoorService.deleteStudentById(id);
		return "redirect:/outdoor";
	}

}
