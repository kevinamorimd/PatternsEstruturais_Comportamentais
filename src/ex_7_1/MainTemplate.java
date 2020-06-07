package ex_7_1;

import java.util.Scanner;

public class MainTemplate 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		//System.out.println(string.toUpperCase());
		
		
		Template template = null;
		template = new StringMaiusculas(string);
		
		template = new StringMaiusculas(string);
		
		template = new DuplicaString(string);
		
		template = new InverteString(string);
		template.run();

	}

}