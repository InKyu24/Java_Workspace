package test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// Stream = 1byte의 흐름
public class FileReadTest {
	public static void main(String[] args) {
	/*	try {
			FileInputStream fin = new FileInputStream("C:\\temp\\a.txt");
			int i = fin.read();
			System.out.println(i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		FileReader fr = null;
		BufferedReader br=null;
		
		try {
			fr = new FileReader("c:\\temp\\a.txt");
			br = new BufferedReader(fr);
			String oneLine = "";
			while((oneLine=br.readLine()) != null) {
				System.out.println(oneLine);
			}
					
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch(IOException e) {
				
			}
		}
	}	
}
