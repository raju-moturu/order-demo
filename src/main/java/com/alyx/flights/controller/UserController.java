package com.alyx.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alyx.flights.entities.User;
import com.alyx.flights.entities.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/registerUser";
	}
	
	@RequestMapping(value ="registerUser",method = RequestMethod.POST)
	public String userRegister(@ModelAttribute("user1") User user,ModelMap modelMap) {
		
		String email=user.getEmail();
		User user1=userRepo.findByEmail(email);
		if(user1==null) {
			userRepo.save(user);
			return "login/login";
			
		}else {
			modelMap.addAttribute("msg", "This email address aready used");
			return "login/registerUser";
		}
	}
	
	
	@RequestMapping(value = "showLogin")
	public String showLogin() {
		return "login/login";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLogin(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap modelMap) {
		User user=userRepo.findByEmail(email);
		if(user.getPassword().equals(password)) {
			System.out.println(user.getPassword());
			return "findFlight";
		}else {
			modelMap.addAttribute("msg", "Invalid credentials register again");
			return "login/login";
		}
	}
	
}
