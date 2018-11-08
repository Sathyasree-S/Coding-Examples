package com.springsample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsample.dao.PolicyJPARepository;
import com.springsample.entity.InsurancePolicy;

@Service
public class PolicyService {
	@Autowired
	private PolicyJPARepository policyInfo;

	public void addNewPolicy(InsurancePolicy policy) {
		policyInfo.save(policy);
	}

	public List<InsurancePolicy> getAllPolicies() {
		return policyInfo.findAll();
	}

	public List<InsurancePolicy> getPolicyByID(InsurancePolicy policy) {
		List<InsurancePolicy> allPolicies = new ArrayList<InsurancePolicy>();
		allPolicies.add(policyInfo.findOne(policy.getPolicyId()));
		return allPolicies;
	}

	public List<InsurancePolicy> deletePolicyByID(InsurancePolicy policy) {
		policyInfo.delete(policy.getPolicyId());
		List<InsurancePolicy> allPolicies = policyInfo.findAll();
		return allPolicies;
	}

	public List<InsurancePolicy> deleteAllPolicies() {
		policyInfo.deleteAll();
		List<InsurancePolicy> allPolicies = policyInfo.findAll();
		return allPolicies;
	}
}
