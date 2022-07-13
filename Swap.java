package poolapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Swap {
	int bid;
	
	public Swap(int bid) {
		this.bid = bid;
	}
	
	public void swap(int bid) throws IOException{
		
		File file = new File("C:\\Users\\Korisnik\\node\\guitest.html");
		Scanner sc = new Scanner(file);
		StringBuffer buffer = new StringBuffer();
		
		while (sc.hasNextLine()) {
			
			buffer.append(sc.nextLine() + System.lineSeparator());
		}
		
		String fileContents = buffer.toString();
		
		sc.close();
		
		if (bid == 1) {
			
			String oldLine = "stol 1: slobodan";
			String newLine = "stol 1: zauzet";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		if (bid == 2) {
			
			String oldLine = "stol 2: slobodan";
			String newLine = "stol 2: zauzet";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		if (bid == 3) {
			
			String oldLine = "stol 3: slobodan";
			String newLine = "stol 3: zauzet";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		
		
		
		FileWriter writer = new FileWriter("C:\\Users\\Korisnik\\node\\guitest.html");
		writer.append(fileContents);
		writer.flush();
		}

	public void contraSwap(int bid) throws IOException{
		
		File file = new File("C:\\Users\\Korisnik\\node\\guitest.html");
		Scanner sc = new Scanner(file);
		StringBuffer buffer = new StringBuffer();
		
		while (sc.hasNextLine()) {
			
			buffer.append(sc.nextLine() + System.lineSeparator());
		}
		
		String fileContents = buffer.toString();
		
		sc.close();
		
		if (bid == 1) {
			
			String oldLine = "stol 1: zauzet";
			String newLine = "stol 1: slobodan";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		if (bid == 2) {
			
			String oldLine = "stol 2: zauzet";
			String newLine = "stol 2: slobodan";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		if (bid == 3) {
			
			String oldLine = "stol 3: zauzet";
			String newLine = "stol 3: slobodan";
			fileContents = fileContents.replaceAll(oldLine, newLine);
			
		}
		FileWriter writer = new FileWriter("C:\\Users\\Korisnik\\node\\guitest.html");
		writer.append(fileContents);
		writer.flush();
		}
	}