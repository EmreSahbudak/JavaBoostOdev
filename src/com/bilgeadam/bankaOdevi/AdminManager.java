package com.bilgeadam.bankaOdevi;

public class AdminManager {
	Account account=new Account();
	
	public void krediBasvurusuonayla(Account account) {
		if (account.krediBasvurusu==true) {
			System.out.println("ba�vurunuz onaylanm��t�r");
		}
	}
	
	public void krediBasvurusuReddet(Account account) {
		if (account.krediBasvurusu==true) {
			System.out.println("ba�vurunuz reddedilmi�tir");
			account.istenenKredi=0;
		}else {
			System.out.println("kredi ba�vurunuz yoktur");
		}
	}


}
