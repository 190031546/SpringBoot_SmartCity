package br.com.carlosjunior.registrationlogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Ajob;
import br.com.carlosjunior.registrationlogin.entities.Student;
import br.com.carlosjunior.registrationlogin.services.StudentService;

@Controller
public class StudentController {

	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//handler methods
	
	@GetMapping("/")
	public String liststudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "index";
		
	}
	@GetMapping("/city")
	public String liststudents1(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "city";
		
	}
	@GetMapping("/students/new")
	public String createstudenform(Model model)	
	{
		Student std=new Student();
		model.addAttribute("student",std);
		return "createform";
 	
	}

	@GetMapping("/category")
	public String showcateory(Model model)	
	{
		 
		return "category";
 	
	}
	
	@PostMapping("/students")
	public String saverecord(@ModelAttribute("student") Student std)
	{
		studentService.saveStudent(std);
		return "redirect:/";
	}
	
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("students", studentService.getStudentById(id));
		return "editstudent";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("students") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setUname(student.getUname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setMobile(student.getMobile());
		existingStudent.setPsd(student.getPsd());
		existingStudent.setCpsd(student.getCpsd());
		
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/city";		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/city";
	}
	 

	
	
}
