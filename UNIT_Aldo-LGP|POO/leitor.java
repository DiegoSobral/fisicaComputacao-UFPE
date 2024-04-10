import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int numero1, numero2, numero3;
	   
	   System.out.print("Insira um número: ");
	   numero1 = lerTeclado.nextInt();
	   
	   System.out.print("Insira um número: ");
	   numero2 = lerTeclado.nextInt();
	  
	  	System.out.println("==========================================================================================================================");
	   
	   if (numero1 < numero2){
	   System.out.println("Os numeros são " + numero1 + " e " + numero2);
	   } 
	   
	   else{ numero3 = numero1;
	   System.out.println("Os numeros são " + numero2 + " e " + numero3);
	   
	}}}
