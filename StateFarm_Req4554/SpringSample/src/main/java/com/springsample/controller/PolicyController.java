package com.springsample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springsample.entity.InsurancePolicy;
import com.springsample.service.PolicyService;

@Controller
public class PolicyController {

	@Autowired
	PolicyService policyService;

	@RequestMapping(value = "/addNewPolicy", method = RequestMethod.GET)
	public ModelAndView addNewPolicy() {

		InsurancePolicy policy = new InsurancePolicy();
		return new ModelAndView("newPolicy", "form", policy);

	}

	@RequestMapping(value = "/addNewPolicy", method = RequestMethod.POST)
	public String newPolicy(InsurancePolicy policy) {
		policyService.addNewPolicy(policy);
		return ("redirect:/getAllPolicies");

	}

	@RequestMapping(value = "/getAllPolicies", method = RequestMethod.GET)
	public ModelAndView getAllPolicies() {
		List<InsurancePolicy> allPolicies = policyService.getAllPolicies();
		return new ModelAndView("allPolicies", "getAllPolicies", allPolicies);

	}

	@RequestMapping(value = "/getPolicyByID", method = RequestMethod.GET)
	public ModelAndView getPolicyByID() {
		InsurancePolicy policy = new InsurancePolicy();
		return new ModelAndView("getPolicy", "form", policy);

	}

	@RequestMapping(value = "/getPolicyByID", method = RequestMethod.POST)
	public ModelAndView getPolicy(InsurancePolicy policy) {
		List<InsurancePolicy> allPolicies = policyService.getPolicyByID(policy);
		return new ModelAndView("allPolicies", "getAllPolicies", allPolicies);
	}

	@RequestMapping(value = "/deletePolicyByID", method = RequestMethod.GET)
	public ModelAndView deletePolicyByID() {
		InsurancePolicy policy = new InsurancePolicy();
		return new ModelAndView("getPolicy", "form", policy);

	}

	@RequestMapping(value = "/deletePolicyByID", method = RequestMethod.POST)
	public ModelAndView deletePolicy(InsurancePolicy policy) {
		List<InsurancePolicy> allPolicies = policyService.deletePolicyByID(policy);
		return new ModelAndView("allPolicies", "getAllPolicies", allPolicies);

	}

	@RequestMapping(value = "/deleteAllPolicies", method = RequestMethod.GET)
	public ModelAndView deleteAllPolicies() {
		List<InsurancePolicy> allPolicies = policyService.deleteAllPolicies();
		return new ModelAndView("allPolicies", "getAllPolicies", allPolicies);

	}

}