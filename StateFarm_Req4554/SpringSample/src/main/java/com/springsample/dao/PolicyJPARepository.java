package com.springsample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsample.entity.InsurancePolicy;

public interface PolicyJPARepository extends JpaRepository<InsurancePolicy, Long> {

}
