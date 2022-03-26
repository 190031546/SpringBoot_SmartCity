package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Hotel;
import br.com.carlosjunior.registrationlogin.entities.Indoor;
import br.com.carlosjunior.registrationlogin.services.HotelInterface;
 
@Controller
public class HotelController
{
	
	private HotelInterface HotelService;
	
	public HotelController(HotelInterface HotelService) {
		super();
		this.HotelService= HotelService;
	}
	
	@GetMapping("/displayhotels")
	public String listeducates(Model model)
	{
		model.addAttribute("addHotel", HotelService.getAllhotel());
		return "displayhotels";
		
	}
	@GetMapping("/hotel")
	public String listeducates1(Model model)
	{
		model.addAttribute("addHotel", HotelService.getAllhotel());
		return "hotel";
		
	}
	@PostMapping("/addHotel")
	public String saverecord(@ModelAttribute("Hotel") Hotel std)
	{
		HotelService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/addHotel/new")
	public String createstudenform(Model model)	
	{
		 
		Hotel ed=new Hotel();
		model.addAttribute("Hotel",ed);
		return "addhotels";
 	
	}

	@GetMapping("/thankyouHotel")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	 

	@GetMapping("/addHotel/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("addHotel", HotelService.getStudentById(id));
		return "edithotel";
	}

	@PostMapping("/addHotel/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("addHotel")  Hotel student,
			Model model) {
		
		// get student from database by id
		Hotel existingStudent =  HotelService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setLocation(student.getLocation());
		existingStudent.setNoofbeds(student.getNoofbeds());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setLuxury(student.getLuxury());
		existingStudent.setHotelname(student.getHotelname());
		
		
		// save updated student object
		 HotelService.updateStudent(existingStudent);
		return "redirect:/hotel";		
	}
	
	@GetMapping("/addHotel/{id}")
	public String deleteStudent(@PathVariable Long id) {
		 HotelService.deleteStudentById(id);
		return "redirect:/hotel";
	}

}
