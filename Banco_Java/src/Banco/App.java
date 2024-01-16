package Banco;

import java.util.Locale;
import java.util.Scanner;

import entites.Application;

public class App {
	
	public static void main(String args[]){
		System.out.println("Iniciando aplicação ");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Application ap;
		
		System.out.println();
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit? (y/n)");
		char verification = sc.next().charAt(0);
		
		if(verification == 'y') {
			System.out.println("Enter initial value: ");
			int initialDeposit = sc.nextInt();
			ap = new Application(number, name, initialDeposit);
		}else {
			ap = new Application(number, name);
		}
		System.out.println();
		System.out.print("Acount data: ");
		System.out.println(ap);
		
		System.out.println();
		
		System.out.println("Enter deposit data: ");
		double depositValue = sc.nextDouble();
		ap.deposit(depositValue);
		System.out.print("Updat Acount data: ");
		System.out.println(ap);
		
		System.out.println("Enter saque data: ");
		double saqueValue = sc.nextDouble();
		ap.witdhdrawn(saqueValue);
		System.out.print("Updat Acount data: ");
		System.out.println(ap);
		
		
	}
	
}
