package com.cisco.chainogresposibility;

import com.cisco.chainogresposibility.RequestType.RequestTy;

public class VP extends Handler{

	@Override
	public void handleRequest(Request req) {
		if(req.getRequest() == RequestTy.PURCHASE) {
			if(req.getAmount() <=1500) {
				System.out.println("VP is handling this request");
			}else {
				successor.handleRequest(req);
			}
		}
		
	}
	
}
