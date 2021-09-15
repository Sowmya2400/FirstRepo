package com.lti.test;

import static org.junit.Assert.*;

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
	

}
