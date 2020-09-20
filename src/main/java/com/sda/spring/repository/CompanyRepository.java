package com.sda.spring.repository;

import com.sda.spring.model.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends PagingAndSortingRepository<Company, Integer> {
}
