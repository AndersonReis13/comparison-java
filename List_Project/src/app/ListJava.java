package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListJava {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>(); //ArrayList 
		
		list.add("Anderson"); // Adicionando elemento a lista
		list.add("Ualisson");
		list.add("Adson");
		list.add("Adauto");
		list.add(1, "Adriele"); // Aqui eu estou "forçando" a esse elemento ficar na pos 1
		
		System.out.println(list.size()); // Size se utiliza para saber o tamanho da lista
		
		for(String elemento : list) {
			System.out.println(elemento);
		}
		System.out.println("--------------------");
		
		list.remove(1);
		list.removeIf(elemento -> elemento.charAt(0) == 'A');
	
		for(String elemento : list) {
			System.out.println(elemento);
		}
		System.out.println("Index Ualisson: " + list.indexOf("Ualisson"));
		System.out.println("--------------------");
		
		List<String> result = list.stream().filter(elemento -> elemento.charAt(0) == 'A').collect(Collectors.toList());
		/*
		 * 	Aqui está criando uma nova lista filtrando os elementos atraves do comando filter e depois criando uma arrow function
		 * para coletar a primeira letra (char) da lista e depois retornando para lista com o comando "collect";
		 * 
		 */
		for(String elemento : result) {
			System.out.println(elemento);
		}
		
		String name = list.stream().filter(elemento -> elemento.charAt(0) == 'U').findFirst().orElse(null);
		System.out.println(name);
		/*
		 * Aqui está fazendo um processo semelhante, filtrando um elemento e depois fazendo a verif
		 * se realmente está o objeto na lista, caso tenha vem normalmente, caso não fica "null".
		 */
		
		
	}
}
