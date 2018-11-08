package com.junitsample.test;

import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.junitsample.beans.PolicyBean;
import com.junitsample.dao.PolicyDAO;

@RunWith(MockitoJUnitRunner.class)
public class JunitSampleTest {
	@InjectMocks
	private PolicyDAO policydao;

	@Mock
	PolicyBean policyBean;

	@BeforeClass
	public static void runBeforeClass() {
//		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void runAfterClass() {
//		System.out.println("AfterClass");
	}

	@Test
	public void testGetPolicyTypeBasedOnID() {
		when(policyBean.getUserPolicyType()).thenReturn("home");
		String policyTypeBasedOnID = policydao.getPolicyTypeBasedOnID("XY123");
		System.out.println("Mocked Policy Type :" + policyTypeBasedOnID);
	}

	@Test
	public void testGetNoOfPersonsInsured() {
		when(policyBean.getNoOfPersonsInsured()).thenReturn(2);
		int noOfPersonsInsured = policydao.getNoOfPersonsInsured("XY123");
		System.out.println("Mocked no. Of Persons Insured :" + noOfPersonsInsured);
	}

	@Test
	public void testGetUserNameBasedOnID() {
		when(policyBean.getPolicyHolderName()).thenReturn("Jack");
		String userName = policydao.getUserNameBasedOnID("XY123");
		System.out.println("Mocked Policy Holder Name :" + userName);
	}

	@Test
	public void testGetUserNameAndPolicyTypeBasedOnID() {
		when(policyBean.getPolicyHolderName()).thenReturn("Jack");
		when(policyBean.getUserPolicyType()).thenReturn("auto");
		String uNandPT = policydao.getUserNameAndPolicyTypeBasedOnID("XY123");
		System.out.println("Mocked User Name and Policy Type :" + uNandPT);
	}

	@Test
	public void testGetPremiumAndCoverageBasedOnID() {
		when(policyBean.getPremium()).thenReturn(75);
		when(policyBean.getPremiumCoverageInMonths()).thenReturn(6);
		String premAndCov = policydao.getPremiumAndCoverageBasedOnID("XY123");
		System.out.println("Mocked Premium and Coverage :" + premAndCov);
	}

}
