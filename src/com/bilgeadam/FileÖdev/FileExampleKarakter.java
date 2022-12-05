package com.bilgeadam.FileÖdev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExampleKarakter {
	
	
	public static void dosyaYarat() throws IOException {
		File dosya =new File("denemeKarakter.txt");
		try {
			if (dosya.exists()) {
				System.out.println("Dosya zaten var");
			}else {
				if (!dosya.createNewFile()) {
					System.out.println("Dosya oluþtuurlurken hata oluþtu");
				}else {
					System.out.println("Dosya oluþturldu/FileExampleKarakter'den");
				}
			}
		} catch (Exception ex) {
			System.out.println("Dosya oluþuturlurken aþaðýdaki hatayý verdi");
			System.out.println(ex.getMessage());
		}
	}
	
	public static void dosyayaYaz() {
		String data="FileWriter ile dosya yolu verildi ve true diyerek üzerine yaz denildi \nBuffered "
				+ "ile yavas bir sekilde yazdirmasi istendi.\nWrite metoduyla yazdirildi. ";
		try {
			FileWriter fileWriter=new FileWriter("denemeKarakter.txt",true);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("denemeKarakter.txt dosyasina Yazma islemi Basarili");
			bufferedWriter.close();
			
		} catch (IOException ex) {
			System.out.println("Dosya oluþuturlurken aþaðýdaki hatayý verdi");
			System.out.println(ex.getMessage());
			
		}
	}
	public static void dosyaOku() throws IOException {
		try {
			FileReader fileReader=new FileReader("denemeKarakter.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line=bufferedReader.readLine();
			
			while (line!=null) {
				System.out.print(line);
				line=bufferedReader.readLine();
				
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println("Dosya oluþuturlurken aþaðýdaki hatayý verdi");
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
