package com.aop.services;

public class PaymentServiceImpl implements PaymentService
{

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		//payment code
		System.out.println("Amount Debited...");
		
		
		System.out.println("Amount Credited..");
	}

}
