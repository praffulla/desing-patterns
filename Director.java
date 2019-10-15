package com.cisco.chainogresposibility;

import com.cisco.chainogresposibility.RequestType.RequestTy;

public class Director extends Handler{

	@Override
	public void handleRequest(Request req) {
		if(req.getRequest() == RequestTy.CONFRENCE) {
			System.out.println("Director can approve confrence");
		}else {
			successor.handleRequest(req);
		}
	}
}
