package com.plan;

public enum ServicePlan {

	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private int planPrice;
	
	private ServicePlan(int planPrice)
	{
		this.planPrice=planPrice;
	}

	public int getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(int planPrice) {
		this.planPrice = planPrice;
	}
	
}
