package com.bilgeadam.File÷dev;

import java.io.IOException;

public class MainFileByte {

	public static void main(String[] args) throws IOException, Throwable {
		FileExampleByte fileExample=new FileExampleByte();
		fileExample.dosyaYarat();
		Thread.sleep(2000);
		fileExample.dosyayaYaz();
		Thread.sleep(2000);
		fileExample.dosyaOku();
		Thread.sleep(2000);

	}

}
