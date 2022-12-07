package com.bilgeadam.bankaOdevi;

public class AccountManager {
	
	Account account=new Account();
	
	
	public void paraYatir(Account account, double miktar) {
		
		if (miktar<10000) {
			account.bakiye=account.bakiye+miktar;
			System.out.println("Yatýrýlan miktar; "+miktar+
					" Güncel bakiye ; " + account.bakiye);
		}else if (miktar>10000) {
			System.out.println("10000 TL üzeri para yatýralamaz");
		}
	}
	
	public void paraCek(Account account, double miktar) {
		if (miktar>account.bakiye) {
			System.out.println("Bakiye yetersiz");
		}else {
			account.bakiye=account.bakiye-miktar;
			System.out.println("kalan bakiyeniz; "+ account.bakiye);
		}
	}
	
	public void hesapBilgileriniGoster(Account account) {
		
		System.out.println("Hesap numaranýz; "+account.hesapNo+" Bakiyeniz ;"+ account.bakiye );
	}

}
