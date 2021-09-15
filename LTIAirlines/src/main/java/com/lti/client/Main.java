package com.lti.client;

import com.lti.model.Flight;

public class Main {
	public static void main(String[] args) {
		Flight flight1=new Flight(101, "Chennai", "Delhi");
		System.out.println(flight1.getFlightId()+" "+flight1.getStart()+" "+flight1.getDestination());
		int n1=10,n2=20;
		if(add(n1,n2)==30)System.out.println("pass");
		else System.out.println("Fail");
	}
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static boolean compare(int n1,int n2) {
		if(n1==n2)return true;
		else return false;
	}

}
