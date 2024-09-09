package com.example.chainofresponsibility;

public class ConcreteHandler1 extends Handler{
	public String handle(String request) {
        if (request.equals("Type1 Request")) {
            return "Handled by ConcreteHandler1";
        } else if (next != null) {
            return next.handle(request);
        } else {
            return "Request not handled";
        }
    }
}
