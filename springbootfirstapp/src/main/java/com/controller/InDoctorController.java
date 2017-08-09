package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;


import com.domain.InDoctor;
import com.repo.InDoctorRepository;

	@RestController
	@RequestMapping("/ins")
    public class InDoctorController {
		
		@Autowired
		private InDoctorRepository kr;
		

		
		@RequestMapping("/indoctor")
		@ResponseBody
		 public List<InDoctor> findall(){
			 	return kr.findAll();
		 }

	
}