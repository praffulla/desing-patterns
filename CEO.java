package com.cisco.chainogresposibility;

public class CEO extends Handler{

	@Override
	public void handleRequest(Request req) {
		System.out.println("I am last in chain so I can approve anything!!");		
	}
}
