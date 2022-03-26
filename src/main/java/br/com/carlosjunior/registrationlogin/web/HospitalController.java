package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Hospital;
import br.com.carlosjunior.registrationlogin.entities.Medicine;
import br.com.carlosjunior.registrationlogin.services.HospitalInterface;
 
@Controller
public class HospitalController
{
	
	private HospitalInterface HospitalService;
	
	public HospitalController(HospitalInterface HospitalService) {
		super();
		this.HospitalService= HospitalService;
	}
	
	@GetMapping("/displayhospitals")
	public String listeducates(Model model)
	{
		model.addAttribute("addHospital", HospitalService.getAllHospital());
		return "displayhospitals";
		
	}
	@GetMapping("/health")
	public String listeducates1(Model model)
	{
		model.addAttribute("addHospital", HospitalService.getAllHospital());
		return "health";
		
	}
	@PostMapping("/addHospital")
	public String saverecord(@ModelAttribute("Hospital") Hospital std)
	{
		HospitalService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addHospital/new")
	public String createstudenform(Model model)	
	{
		 
		Hospital ed=new Hospital();
		model.addAttribute("Hospital",ed);
		return "addhospitals";
 	
	}

	@GetMapping("/thankyouHospital")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	 

	@GetMapping("/addHospital/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addHospital", HospitalService.getStudentById(id));
		return "edithospital";
	}

	@PostMapping("/addHospital/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addHospital") Hospital student,
			Model model) {
		
		// get student from database by id
		Hospital existingStudent = HospitalService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setSpecialist(student.getSpecialist());
		existingStudent.setQualifications(student.getQualifications());
		existingStudent.setServices(student.getServices());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setHospitalname(student.getHospitalname());
		
		
		// save updated student object
		HospitalService.updateStudent(existingStudent);
		return "redirect:/health";		
	}
	
	@GetMapping("/addHospital/{id}")
	public String deleteStudent(@PathVariable Long id) {
		HospitalService.deleteStudentById(id);
		return "redirect:/health";
	}

	 

}
