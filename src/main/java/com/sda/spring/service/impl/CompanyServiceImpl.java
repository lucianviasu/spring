package com.sda.spring.service.impl;

import com.sda.spring.components.CompanyMapper;
import com.sda.spring.dto.CompanyCreateDto;
import com.sda.spring.dto.CompanyInfoDto;
import com.sda.spring.model.Company;
import com.sda.spring.repository.CompanyRepository;
import com.sda.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;
    private final CompanyMapper companyMapper;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository, CompanyMapper companyMapper) {
        this.repository = repository;
        this.companyMapper = companyMapper;
    }

    @Override
    public CompanyInfoDto create(CompanyCreateDto companyCreateDto) {
        return companyMapper.toDto(repository.save(companyMapper.toEntity(companyCreateDto)));
    }

    @Override
    public List<CompanyInfoDto> getAllCompanies() {
        return companyMapper.toDtoList(repository.findAll());
    }

    @Override
    public void populateDb(List<Company> companies) {
        repository.saveAll(companies);
    }


}
