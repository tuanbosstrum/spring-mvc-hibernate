package com.pxu.k18.Company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pxu.k18.Company.model.Company;
import com.pxu.k18.Company.service.CompanyService;


@Controller
@RequestMapping("/")
public class CompanyController {
	@Autowired
    private CompanyService companyService;

    @GetMapping({"/","/list"})
    public String listCustomers(Model theModel) {
        List < Company > theCompanyes = companyService.getCompanys();
        theModel.addAttribute("companys", theCompanyes);
        return "list-company";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Company theCompany = new Company();
        theModel.addAttribute("company", theCompany);
        return "company-form";
    }

    @PostMapping("/saveCompany")
    public String saveCompany(@ModelAttribute("company") Company theCompany) {
        companyService.save(theCompany);
        return "redirect:/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("id") int theId,
        Model theModel) {
    	Company theCustomer = companyService.getCompany(theId);
        theModel.addAttribute("company", theCustomer);
        return "company-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("id") int theId) {
        companyService.delete(theId);
        return "redirect:/list";
    }
}
