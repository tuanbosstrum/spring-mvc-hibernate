package com.edu.phuxuan.cntt.k17.artist.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.edu.phuxuan.cntt.k17.artist.entity.Province;
import com.edu.phuxuan.cntt.k17.artist.service.BaseService;

@Controller
@RequestMapping("/province")
public class ProvinceController {
	
	@Autowired
    private BaseService<Province> provinceService;
	
	@GetMapping("/list")
	public String listProvinces(Model theModel) {
		List<Province> theProvinces = provinceService.getAll();
		theModel.addAttribute("provinces", theProvinces);
	
		
		return "list-provinces";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		//LOG.debug("inside show customer-form handler method");
		Province theProvince = new Province();
		theModel.addAttribute("province", theProvince);
		
		return "province-form";
	}
	
	@PostMapping("/saveProvince")
	public String saveProvince(@Valid @ModelAttribute("province") Province theProvince , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
    		
			return  "province-form"; 
		
		}else {
			provinceService.save(theProvince);	
			return "redirect:/province/list";
		}
		
	}
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("provinceId") int theId,
									Model theModel)  {
		Province theProvince = provinceService.getByID(theId);	
		theModel.addAttribute("province", theProvince);
		return "province-form";
	}
	
	@GetMapping("/delete")
	public String deleteProvince(@RequestParam("provinceId") int theId)  {
		provinceService.deleteById(theId);
		return "redirect:/province/list";
	}
}
