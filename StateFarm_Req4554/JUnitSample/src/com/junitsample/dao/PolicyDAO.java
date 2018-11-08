package com.junitsample.dao;

import com.junitsample.beans.PolicyBean;

public class PolicyDAO {
	private PolicyBean policyBean;

	public String getPolicyTypeBasedOnID(String ID) {
		return policyBean.getUserPolicyType().toString();
	}

	public String getUserNameBasedOnID(String ID) {
		return policyBean.getPolicyHolderName();
	}

	public String getUserNameAndPolicyTypeBasedOnID(String ID) {
		return policyBean.getPolicyHolderName() + "," + policyBean.getUserPolicyType().toString();
	}

	public String getPremiumAndCoverageBasedOnID(String ID) {
		return "$" + policyBean.getPremium() + "," + policyBean.getPremiumCoverageInMonths() + "months";
	}

	public int getNoOfPersonsInsured(String ID) {
		// TODO Auto-generated method stub
		return policyBean.getNoOfPersonsInsured();
	}
}
