package com.cisco.chainogresposibility;

import com.cisco.chainogresposibility.RequestType.RequestTy;

public class Request {	
	
	private RequestTy request;
	private double amount;
	
    public Request(RequestTy rt, double amount) {
    	this.request = rt;
    	this.amount = amount;
    }	
	
	
	public RequestTy getRequest() {
		return request;
	}
	
	
	public double getAmount() {
		return amount;
	}
	
	
}
