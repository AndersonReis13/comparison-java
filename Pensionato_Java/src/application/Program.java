package application;

import java.util.Scanner;

import entites.Estudantes;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Estudantes[] vect = new Estudantes[10];
		
	System.out.println("Quantos quartos serão disponibilizado?");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x; i++) {
			System.out.print("Aluguel #" + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber]= new Estudantes(name, email);
		}
		
		for(int i = 0; i<10; i++) {
			if(vect[i]!= null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		
	
	}
}
