package com.phoenix.services;

import com.phoenix.math.Calculator;
/*
 * @author dharmil.maru@stltech.in
 * @version 1.0
 * */
public class CalculatorServices {

	private Calculator cal;
	
	public CalculatorServices(Calculator cal) {
		// TODO Auto-generated constructor stub
		super();
		this.cal = cal;
	}

	public Calculator getCal() {
		return cal;
	}

	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	//business logic method
	public int addition(int x,int y) {
		return cal.add(x, y);
	}
	
	
}
