package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entites.Comment;
import entites.Post;

public class Program {
	public static void main(String args[]) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Woow that is awsoome!");
		
		Post p1 = new Post(sdf.parse("22/06/2005 11:54:04"),
				"Treelving to New Zeeland", 
				"I'm good trelving", 12
				);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.print(p1);
		
	}
}
