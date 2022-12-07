package com.bilgeadam.File�dev;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExampleByte {
	
	public static void dosyaYarat() throws IOException {
		File dosya =new File("denemeByte.txt");
		try {
			if (dosya.exists()) {
				System.out.println("Dosya zaten var");
			}else {
				if (!dosya.createNewFile()) {
					System.out.println("Dosya olu�tuurlurken hata olu�tu");
				}else {
					System.out.println("Dosya olu�turldu/FileExampleByte'tan");
				}
			}
		} catch (Exception ex) {
			System.out.println("Dosya olu�uturlurken a�a��daki hatay� verdi");
			System.out.println(ex.getMessage());
		}
	}
	public static void dosyayaYaz() throws IOException {
		String data="FileoutputStream ile dosya yolu verildi. \nBuffered "
				+ "ile yavas bir sekilde yazdirmasi istendi.\nWrite metoduyla yazdirildi. ";
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("denemeByte.txt");
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			byte[] byteArray=data.getBytes();
			bufferedOutputStream.write(byteArray);
			System.out.println("denemeByte.txt dosyasina Yazma islemi Basarili");
			bufferedOutputStream.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("Dosya olu�uturlurken a�a��daki hatay� verdi");
			System.out.println(ex.getMessage());
			
		}
	}
	public static void dosyaOku() throws Exception{
		
		try {
			FileInputStream fileInputStream = new FileInputStream("denemeByte.txt");
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			int i=bufferedInputStream.read();
			while (i!=-1) {
				System.out.print((char)i);
				i=bufferedInputStream.read();
				System.out.println("Okuma islemi basarili");
				bufferedInputStream.close();
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println("Dosya olu�uturlurken a�a��daki hatay� verdi");
			System.out.println(ex.getMessage());
		}
		
	}

}
