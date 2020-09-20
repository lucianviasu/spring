package com.sda.spring.controller;

import com.sda.spring.components.CustomFaker;
import com.sda.spring.dto.CompanyCreateDto;
import com.sda.spring.dto.CompanyInfoDto;
import com.sda.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {

    private final CompanyService companyService;
    private final CustomFaker customFaker;

    @Autowired
    public CompanyController(CompanyService companyService, CustomFaker customFaker) {
        this.companyService = companyService;
        this.customFaker = customFaker;
    }

    @PostMapping("/create")
    public ResponseEntity<CompanyInfoDto> create(@RequestBody CompanyCreateDto companyCreateDto){
        return ResponseEntity.ok(companyService.create(companyCreateDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CompanyInfoDto>> getAllCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @GetMapping("/populate")
    public void faker(){
        companyService.populateDb(customFaker.createDummyCompanyList());
    }
}
