package com.bilgeadam.File÷dev;

import java.io.IOException;

public class MainFileKarakter {
	public static void main(String[] args) throws Throwable {
	
		
	FileExampleKarakter fileExampleKarakter=new FileExampleKarakter();
	fileExampleKarakter.dosyaYarat();
	Thread.sleep(2000);
	fileExampleKarakter.dosyayaYaz();
	Thread.sleep(2000);
	fileExampleKarakter.dosyaOku();
	Thread.sleep(2000);
	}
}
