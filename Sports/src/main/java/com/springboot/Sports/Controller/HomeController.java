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

import com.springboot.Sports.Model.ParticipantModel;
import com.springboot.Sports.dao.ParticipantRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class HomeController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@GetMapping("/participants")
	public List<ParticipantModel> getAllParticipants(){
		return participantRepository.findAll();
		
	}
	
	@PostMapping("/participants")
	public ParticipantModel createParticipants(@RequestBody ParticipantModel participant)
	{
		return participantRepository.save(participant);
		
	} 
	
	@GetMapping("/participants/{id}")
	public Optional<ParticipantModel> getParticipantsById(@PathVariable(value = "id") int id){
		return participantRepository.findById(id);
		
	}
	
	@PutMapping("/participants/{id}")
	public Optional<ParticipantModel> updateParticipants(@PathVariable(value = "id") int id,@RequestBody ParticipantModel participant) {
		return participantRepository.findById(id);
	}
	
	@DeleteMapping("/participants/{id}")
	public void deleteParticipants(@PathVariable(value = "id") int id) {
		
	}

}
