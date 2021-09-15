package com.lti.test;

import static org.junit.Assert.*;

<<<<<<< HEAD
import org.junit.Test;

import com.lti.client.Main;

public class TestCase1 {

    @Test
	public void testAdd() {
		int n1=20,n2=20;
		assertEquals(30, Main.add(n1, n2));
	}
	
	@Test
	public void testCompare() {
		int n1=10,n2=10;
		assertTrue(Main.compare(n1, n2));
	}
	
=======

import org.junit.Test;

import com.lti.client.ClientMain;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		//prepare test data here:
		int num1=10;int num2=20;
		
		//Test here:
		//assertEquals(30, ClientMain.add(num1,num2));
		
		
	}
	
	@Test
	public void testNums() {
		//prepare test data here:
		int num1=10;int num2=10;
		
		//Test here:
		//assertTrue(ClientMain.compareNums(num1, num2));
	}
	
	@Test
	public void testObjects() {
		//prepare test data here:
		Flight f1 = new Flight(1001, "BLR", "BOM");
		Flight f2 = new Flight(1001, "BLR", "BOM");
		
		//Test here:
		//assertSame("Objects are not same",f1,f2);
		//assertEquals("Objects are not equal",f1,f2);
		//assertNull(f2);
		assertNotNull(f2);
		
		
	}
>>>>>>> branch 'master' of https://github.com/sharathchitt/FirstMavenProject.git

}
