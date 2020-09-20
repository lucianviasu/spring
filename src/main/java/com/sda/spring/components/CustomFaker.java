package com.sda.spring.components;

import com.github.javafaker.Faker;
import com.sda.spring.model.Company;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Placinta
 * @since 07/08/2020
 */

@Component
public class CustomFaker {


    public List<Company> createDummyCompanyList(){

        Faker faker = new Faker();

        List<Company> dummyCompany = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            Company company = new Company();
            company.setAddress(faker.address().fullAddress());
            company.setCreatedBy(faker.name().username());
            company.setRegistrationNumber(faker.idNumber().toString());
            company.setEmail(faker.bothify("????##@gmail.com"));
            company.setPhoneNumber(faker.phoneNumber().cellPhone());
            company.setName(faker.name().title());

            dummyCompany.add(company);
        }

        return dummyCompany;
    }

}
