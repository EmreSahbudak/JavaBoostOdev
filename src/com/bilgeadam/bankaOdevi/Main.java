package com.bilgeadam.bankaOdevi;

public class Main {

	public static void main(String[] args) {
		Account account1=new Account();
		AccountManager accountManager=new AccountManager();
		User user1=new User("Arda", "emre", account1);
		UserManager userManager=new UserManager();
		AdminManager adminManager=new AdminManager();
		System.out.println("--------------------------");
		accountManager.paraYatir(account1, 500);
		accountManager.paraYatir(account1, 2000);
		accountManager.paraCek(account1, 1000);
		accountManager.hesapBilgileriniGoster(account1);
		System.out.println("--------------------------");
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.kredibAsvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusuonayla(account1);
		System.out.println("--------------------------");
		accountManager.hesapBilgileriniGoster(account1);
		System.out.println("--------------------------");
		userManager.krediBorcuOde(account1, 1000);
		
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		

	}

}
