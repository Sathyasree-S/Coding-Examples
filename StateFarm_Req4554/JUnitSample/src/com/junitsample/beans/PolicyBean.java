package com.junitsample.beans;

public class PolicyBean {
	private String PolicyId;
	private String policyHolderName;

	public enum PolicyType {
		auto, rental, home
	};

	private int noOfPersonsInsured;
	private int premium;
	private PolicyType userPolicyType;

	public String getUserPolicyType() {
		return userPolicyType.toString();
	}

	public void setUserPolicyType(PolicyType userPolicyType) {
		this.userPolicyType = userPolicyType;
	}

	private int premiumCoverageInMonths;

	public String getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(String policyId) {
		PolicyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getNoOfPersonsInsured() {
		return noOfPersonsInsured;
	}

	public void setNoOfPersonsInsured(int noOfPersonsInsured) {
		this.noOfPersonsInsured = noOfPersonsInsured;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public int getPremiumCoverageInMonths() {
		return premiumCoverageInMonths;
	}

	public void setPremiumCoverageInMonths(int premiumCoverageInMonths) {
		this.premiumCoverageInMonths = premiumCoverageInMonths;
	}

	@Override
	public String toString() {
		return "PolicyBean [PolicyId=" + PolicyId + ", policyHolderName=" + policyHolderName + ", noOfPersonsInsured="
				+ noOfPersonsInsured + ", premium=" + premium + ", premiumCoverageInMonths=" + premiumCoverageInMonths
				+ "]";
	}

}
