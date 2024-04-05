import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int numero, resto;
	   
	   System.out.print("Insira um número: ");
	   numero = lerTeclado.nextInt();
	  
	  	System.out.println("==========================================================================================================================");
	   
	   resto = numero % 2;
	   
	   if (resto == 1 || resto == -1){
	   System.out.println("O número é impar");
	   } 
	   
	   else{
	   System.out.println("O número é par");   
	}}}
