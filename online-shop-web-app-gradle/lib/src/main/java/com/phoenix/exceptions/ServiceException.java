package com.phoenix.exceptions;
/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 1.0
* Copyright : Sterlite Technologies
* 
* */
public class ServiceException extends Exception {

		private String errormsg;

		public ServiceException(String errormsg) {
			super();
			this.errormsg = errormsg;
		}
		
}
