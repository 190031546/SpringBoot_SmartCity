package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Medicine;
import br.com.carlosjunior.registrationlogin.entities.Outdoor;
import br.com.carlosjunior.registrationlogin.services.MedicineInterface;
 
@Controller
public class MedicineController
{
	
	private MedicineInterface MedicineService;
	
	public MedicineController(MedicineInterface MedicineService) {
		super();
		this.MedicineService= MedicineService;
	}
	
	@GetMapping("/displaymedicine")
	public String listeducates(Model model)
	{
		model.addAttribute("addMedicine", MedicineService.getAllMedicine());
		return "displaymedicene";
		
	}
	@GetMapping("/medicine")
	public String listeducates1(Model model)
	{
		model.addAttribute("addMedicine", MedicineService.getAllMedicine());
		return "medicine";
		
	}
	@PostMapping("/addMedicine")
	public String saverecord(@ModelAttribute("Medicine") Medicine std)
	{
		MedicineService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addMedicine/new")
	public String createstudenform(Model model)	
	{
		 
		Medicine ed=new Medicine();
		model.addAttribute("Medicine",ed);
		return "addmedicine";
 	
	}

	@GetMapping("/thankyouMedicine")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	

	
	@GetMapping("/addMedicine/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addMedicine", MedicineService.getStudentById(id));
		return "editmedicine";
	}

	@PostMapping("/addMedicine/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addMedicine") Medicine student,
			Model model) {
		
		// get student from database by id
		Medicine existingStudent = MedicineService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setAvailabletime(student.getAvailabletime());
		existingStudent.setExpdate(student.getExpdate());
		existingStudent.setMedicinename(student.getMedicinename());
		existingStudent.setImportfrom(student.getImportfrom());
		
		
		// save updated student object
		MedicineService.updateStudent(existingStudent);
		return "redirect:/medicine";		
	}
	
	@GetMapping("/addMedicine/{id}")
	public String deleteStudent(@PathVariable Long id) {
		MedicineService.deleteStudentById(id);
		return "redirect:/medicine";
	}

	 

}
