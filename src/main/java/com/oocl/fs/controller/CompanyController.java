package com.oocl.fs.controller;

import com.oocl.fs.entity.Company;
import com.oocl.fs.model.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @GetMapping("/companies")
    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }

    @PutMapping("/companies")
    public Company updateCompany(@RequestBody Company company){
        List<Company> companies = companyRepository.findAll();
        for (Company dbCompany: companies) {
            if (dbCompany.getId() == company.getId()){
                return companyRepository.save(company);
            }else {
                return null;
            }
        }
        return null;
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable(value = "id") Integer id){
        companyRepository.deleteById(id);
    }
}