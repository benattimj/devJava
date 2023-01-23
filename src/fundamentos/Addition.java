package fundamentos;

import java.util.Scanner;

public class Addition 

{
	//Metodo main inicia a execução do aplicativo Java
	
	public static void main(String[] args)
	{
		
		//Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // Primeiro numero a somar
		int number2; // Segundo numero a somar
		int sum;    // Soma dos dois numero
		
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
	
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
		number1 = input.nextInt();
	
		
	}
}
