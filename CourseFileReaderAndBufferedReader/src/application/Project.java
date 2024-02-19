package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project {
	public static void main(String args[]) {
		String path = "C:\\Projetos_Programação\\teste.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
	}
}
