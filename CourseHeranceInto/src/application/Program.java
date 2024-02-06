package application;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingAccount;

public class Program {
	public static void main(String args[]) {
		
		Account acc = new Account(1001,"Anderson",0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Sirleide", 80.0, 1000.0);
		//UPCAST - ATRIBUINDO UMA SUBCLASSE PARA A SUPERCLASSE
		
		Account acc1 = bacc;
		
		Account acc2 = new BusinessAccount(1003,"Alisson",300.0, 700.0);
		Account acc3 = new SavingAccount(1004, "Gabriela", 109.0, 800.0);
		
		//Downcast - ATRIBUINDO UMA SUPERCLASSE PARA UMA SUBCLASSE OU SEJA, PROCESSO INVERSO DO UPCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
				System.out.println("Loan");
		/*
		 * Porque não entrou nesse if? porque em momento nenhum o acc3
		 * foi instanciado como uma BusinessAccount, apenas como saving
		 */
				
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.savingAccount();
			System.out.println("UPDATE!"); // aqui é totalmente diferente.
			
		}
		
	
	}
}
