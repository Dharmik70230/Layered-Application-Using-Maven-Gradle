package com.phoenix.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.Calculator;

public class CalculaorServiceTest {

	private CalculatorServices  calSe; 
	
	@Before
	public void setUp() {
		calSe = new CalculatorServices(new Calculator());
	}
	
	@Test
	public void testAddition() {
		assertEquals(30,calSe.addition(10, 20));
	}
	
	@After
	public void clean() {
		calSe = null;
	}
}
