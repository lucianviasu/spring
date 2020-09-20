package com.sda.spring.components;

import com.sda.spring.dto.CompanyCreateDto;
import com.sda.spring.dto.CompanyInfoDto;
import com.sda.spring.model.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Placinta
 * @since 19/09/2020
 *
 * This component will be used to convert from Entity to Dto
 */

@Component
public class CompanyMapper {

    public static Company toEntity(CompanyCreateDto companyCreateDto) {
        Company company = new Company();
        company.setAddress(companyCreateDto.getAddress());
        company.setEmail(companyCreateDto.getEmail());
        company.setName(companyCreateDto.getName());
        company.setPhoneNumber(companyCreateDto.getPhoneNumber());
        company.setRegistrationNumber(companyCreateDto.getRegistrationNumber());

        return company;
    }

    public static CompanyInfoDto toDto(Company company) {
        CompanyInfoDto companyInfoDto = new CompanyInfoDto();
        companyInfoDto.setAddress(company.getAddress());
        companyInfoDto.setCreatedAt(company.getCreatedAt());
        companyInfoDto.setCreatedBy(company.getCreatedBy());
        companyInfoDto.setEmail(company.getEmail());
        companyInfoDto.setRegistrationNumber(company.getRegistrationNumber());
        companyInfoDto.setPhoneNumber(company.getPhoneNumber());
        companyInfoDto.setId(company.getId());
        companyInfoDto.setName(company.getName());
        companyInfoDto.setUpdatedAt(company.getUpdatedAt());

        return companyInfoDto;
    }

    public static List<CompanyInfoDto> toDtoList(Iterable<Company> entities){
        List<CompanyInfoDto> results = new ArrayList<>();
        entities.forEach(entity -> results.add(toDto(entity)));

        return results;
    }
}
