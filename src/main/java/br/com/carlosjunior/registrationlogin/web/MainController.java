package br.com.carlosjunior.registrationlogin.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import br.com.carlosjunior.registrationlogin.services.UserService;
import br.com.carlosjunior.registrationlogin.services.UserServiceImpl;
import br.com.carlosjunior.registrationlogin.entities.User;

@Controller
public class MainController {
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/education")
	public String education() {
		return "education";
	}
	@GetMapping("/hospital")
	public String hospital() {
		return "hospital";
	}
	@GetMapping("/finance")
	public String finance() {
		return "finance";
	}
	@GetMapping("/hotels")
	public String hotels() {
		return "hotels";
	}
	@GetMapping("/sports")
	public String sports() {
		return "sports";
	}
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	@GetMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	public MainController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/display")
	public String display() {
		return "display";
	}
	@GetMapping("/displayfile")
	public String displayfile() {
		return "displayfile";
	}
	@GetMapping("/admin/1762")
	public String admin() {
		return "admin";
	}
	@GetMapping("/admin1/1762")
	public String admin1() {
		return "admin1";
	}
	 
	 
	/*@GetMapping("/display")
	  public String liststudents(Model model)
	  {
	    model.addAttribute("students", userService.getAllStudents());
	    return "display";
	    
	  }*/
	
	 
}
