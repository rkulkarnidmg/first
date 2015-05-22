package com.code;

import com.co.ThirdClass;
import com.coding.MySecondTeller;
import com.myfirst.test.FileNameTeller;

public class MyHelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		FileNameTeller ft = new FileNameTeller();
		System.out.println(ft.FileNameTeller());
		
		MySecondTeller st = new MySecondTeller();
		System.out.println(st.MySecondTeller());
		
		System.out.println(st.MySecond());
		
		ThirdClass tc = new ThirdClass();
		System.out.println(tc.WhatClass());
		
	}

}
