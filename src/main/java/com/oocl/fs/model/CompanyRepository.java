package com.oocl.fs.model;

import com.oocl.fs.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
