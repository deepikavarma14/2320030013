package com.example.chainofresponsibility;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your request: ");
        String request = scanner.nextLine();

        // Processing the request
        String result = handler1.handle(request);
        System.out.println(result);
    }
	}


