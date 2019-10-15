package com.cisco.chainogresposibility;

import com.cisco.chainogresposibility.RequestType.RequestTy;

//example code form pluralsight.

public class ChainofResponsibilityPatternDemo {
	public static void main (String args[]) {
		
		Director dir = new Director();
		VP vp = new  VP();
		CEO ceo = new CEO();
		
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request req1 = new Request(RequestTy.PURCHASE, 1000);
		dir.handleRequest(req1);
	}
}
