package com.sda.spring.service;


import com.sda.spring.dto.CompanyCreateDto;
import com.sda.spring.dto.CompanyInfoDto;
import com.sda.spring.model.Company;

import java.util.List;

public interface CompanyService {

    CompanyInfoDto create(CompanyCreateDto company);

    List<CompanyInfoDto> getAllCompanies();

    void populateDb(List<Company> companies);
}
