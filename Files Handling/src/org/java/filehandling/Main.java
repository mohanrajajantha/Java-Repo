package org.java.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file=new File("New_textfile.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String text="Hello world";
		try {
			BufferedWriter bs=new BufferedWriter(new FileWriter(file,true));
			bs.write(text);
			bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			
			String readText;
			
			while ((readText=br.readLine())!=null)
			{
				System.out.println(readText);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("File created");
		
		System.out.println(file.getName());
		
		if ( file.exists())
		{
			System.out.println("File is there");
		}
		else
		{
			System.out.println("File is not there");
		}
		 
		if (file.delete())
		{
			System.out.println("File deleted");
		}
		else
		{  
			System.out.println(" File was not deleted");
		}
		
		
	}

}
