package com.bilgeadam.bankaOdevi;

import java.util.Random;

public class Account {
	public String hesapNo;
	public double istenenKredi;
	public boolean krediBasvurusu;
	public static double bakiye;
	
	public Account() {
		Random random=new Random();
		int i= random.nextInt();
		hesapNo=String.valueOf(i);
	}

	public Account(String hesapNo) {
		super();
		this.hesapNo = hesapNo;
	}
	
	
	

}
