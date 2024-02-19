package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Project {
	public static void main(String[] args) {
		
		String[] lines = new String[] { "Hello, Anderson", "Good morning"};
		
		String path = "C:\\Projetos_Programação\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				for(String line : lines) {
					bw.write(line); // Aqui esta lendo uma nova linha se utiliza o write
					bw.newLine(); // Quando esta escrevendo um arquivo ele não consegue indentificar uma nova linha por isso usar isso.
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
