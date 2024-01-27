package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Project {
	public static void main(String args[]) {
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Isso serve para aceitar outros tipos de formatação, existe siglas especificas para cada formatação, exemplo yyyy = ano(2008)
		
		
		LocalDate d01 = LocalDate.now(); // Aqui pega a data local do úsuario
		
		LocalDateTime d02 = LocalDateTime.now(); // aqui pega a data e hora local do úsuario
		Instant d03 = Instant.now(); // Aqui pega o horario "Z" O GLOBAL, que no caso é de londres.
		
		LocalDate d04 = LocalDate.parse("2005-10-13"); // parse tu usa para "sobrescrever" e tem que ser com suas especificações
		LocalDateTime d05 = LocalDateTime.parse("2005-10-13T20:03:01"); 
		
		LocalDate d06 = LocalDate.parse("27/01/2024", fm1);
		LocalDate d07 = LocalDate.of(2005, 10, 13);
		
		System.out.println(" D01 = " + d01.toString());
		System.out.println(" D02 = " + d02.toString());
		System.out.println(" D03 = " + d03.toString());
		System.out.println(" D04 = " + d04.toString());
		System.out.println(" D05 = " + d05.toString());
		System.out.println(" D06 = " + d06.toString());
		System.out.println(" D07 = " + d07.toString());	
	}
}
