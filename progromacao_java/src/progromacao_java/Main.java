package progromacao_java;


import java.util.Locale;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		System.out.println("***Lista Exercicio");
		Locale.setDefault(Locale.US);
		// condicao();
		// verificar();
		// multiplos();
		// jogo();
		// telefone();
	}
	
	public static void condicao() {
		System.out.println("***Iniciando a condicao***");
		
		Scanner sc = new Scanner(System.in);
		//O método scanner que é possivel obter importando com o java util 
		// serve para ler algo que foi adicionado a variavel. 
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();	// lendo a variavel utilizando o next+(tipo de variavel)	
		
		//verificando se o num é positivo ou negativo
		if(num<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
	}
	
	public static void verificar() {
		
		System.out.println(" ");
		System.out.println("***Iniciando a verificacao***");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();	
		// verificando se o num é par ou impar
		if(num % 2 == 0){
			System.out.println("O num " + num + "é par");
		}
		else {
			System.out.println("O num" + num + "é impar");
		}
		

	}
	
	public static void multiplos() {
		System.out.println(" ");
		System.out.println("***Iniciando o multiplos***");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int numAux = sc.nextInt();	
		
		//Fazendo a verificacao de numeros multiplos
		if(numAux % num == 0) {
			System.out.println("O " + num + " e multiplo de " + numAux  );
		}else {
			System.out.println("O " + num + " não e multiplo de " + numAux  );
		}
	}

	
	public static void jogo() {
		System.out.println(" ");
		System.out.println("***Iniciando a contagem do jogo***");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o inicio do jogo: ");
		int hrInicio = sc.nextInt();
		
		System.out.println("Digite o fim do jogo: ");
		int hrFinal = sc.nextInt();

		int tempoTotal;
		
		if( hrFinal > hrInicio ) {
			tempoTotal = hrFinal - hrInicio;
		}else {
			tempoTotal = 24 - hrInicio+hrFinal;
		}
		
			System.out.println("O horario total foi de: " + tempoTotal);
		
	}
	
	
	public static void telefone() {
		System.out.println("***Iniciando telefone***");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o total de minutos: ");
		int minutos = sc.nextInt();
		int total = 50;
		if(minutos > 100) {
			total += (minutos - 100) * 2;
		}
		
		System.out.println(total);
		
	}

}
