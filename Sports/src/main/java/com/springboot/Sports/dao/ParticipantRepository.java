package com.springboot.Sports.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Sports.Model.ParticipantModel;
@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantModel,Integer> {
	

}
