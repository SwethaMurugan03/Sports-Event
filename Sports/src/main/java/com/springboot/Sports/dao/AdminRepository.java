package com.springboot.Sports.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Sports.Model.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer>{

}
