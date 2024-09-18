package com.example.chainofresponsibility;

public class ConcreteHandler2 extends Handler {
	 public String handle(String request) {
	        if (request.equals("Type2 Request")) {
	            return "Handled by ConcreteHandler2";
	        } else if (next != null) {
	            return next.handle(request);
	        } else {
	            return "Request not handled";
	        }
	    }
}
