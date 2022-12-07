package com.bilgeadam.bankaOdevi;

public class AdminManager {
	Account account=new Account();
	
	public void krediBasvurusuonayla(Account account) {
		if (account.krediBasvurusu==true) {
			System.out.println("baþvurunuz onaylanmýþtýr");
		}
	}
	
	public void krediBasvurusuReddet(Account account) {
		if (account.krediBasvurusu==true) {
			System.out.println("baþvurunuz reddedilmiþtir");
			account.istenenKredi=0;
		}else {
			System.out.println("kredi baþvurunuz yoktur");
		}
	}


}
