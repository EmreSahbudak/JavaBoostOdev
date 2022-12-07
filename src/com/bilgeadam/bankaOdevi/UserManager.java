package com.bilgeadam.bankaOdevi;

public class UserManager {
	Account account=new Account();
	public String emailformat="@xbanka.com";
	public int para;
	public double krediBorcu=para;
	
	public String otomatikEmailOlustur(User user) {
		//System.out.println(user.name+"."+user.surname+emailformat);
		return user.name+"."+user.surname+emailformat;
	}
	
	
	public void bilgileriGoster(User user) {
		System.out.println("isim: " +user.name+ " soyisim : "+user.surname+
				" Hesap no: "+ account.hesapNo+" email: "+otomatikEmailOlustur(user)+
				" hesap bakiyeniz: "+account.bakiye);
	}

	
	public void kredibAsvurusundaBulun(Account account,int para) {
		System.out.println(para+" degerinde kredi ba�vurusu yapt�n�z");
		System.out.println("L�tfen onay bekleyiniz");
		account.bakiye=account.bakiye+para;
		account.krediBasvurusu=true;
	
	}
	
	public void krediBorcuOde(Account account, double taksit) {
		if (account.krediBasvurusu=false) {
			System.out.println("kredi borcunuz yoktur");
		}else {
			//double taksit2= (double) para;
			//taksit=taksit2;
			//para=para-taksit2;
			//System.out.println(taksit+" borc odediniz "+ "g�ncel kredi borcu "+para);
			krediBorcu=krediBorcu-taksit;
			System.out.println(taksit+" borc odediniz "+ "g�ncel kredi borcu "+ krediBorcu);
		}
	}

}
