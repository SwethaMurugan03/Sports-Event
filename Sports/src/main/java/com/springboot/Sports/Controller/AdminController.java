package com.springboot.Sports.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Sports.Model.AdminModel;
import com.springboot.Sports.dao.AdminRepository;

@RestController
@RequestMapping("/ad")
@CrossOrigin("*")


public class AdminController {
	@Autowired
	private AdminRepository adminRepository;
	
	@GetMapping("/admin")
	public List<AdminModel> getAlladmin(){
		return adminRepository.findAll();
		
	}
	
	@PostMapping("/admin")
	public AdminModel createAdmin(@RequestBody AdminModel admin)
	{
		return adminRepository.save(admin);
		
	} 
	
	@GetMapping("/admin/{id}")
	public Optional<AdminModel> getAdminById(@PathVariable(value = "id") int id){
		return adminRepository.findById(id);
		
	}
	
	@PutMapping("/admin/{id}")
	public Optional<AdminModel> updateAdmin(@PathVariable(value = "id") int id,@RequestBody AdminModel admin) {
		return adminRepository.findById(id);
	}
	
	@DeleteMapping("/admin/{id}")
	public void deleteAdmin(@PathVariable(value = "id") int id) {
		
	}

}
