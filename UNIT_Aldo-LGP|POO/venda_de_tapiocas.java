import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int tapiocassimples = 5, tapiocasgourmet = 8, numtapioscasimples, numtapiocagourmet, valorbruto, valor1, valor2, valor3;
	   double valorliq, gastos;
	   
	   System.out.print("Insira a quantidade de tapiocas simples: ");
	   numtapioscasimples = lerTeclado.nextInt();
	      
	   System.out.print("Insira a quantidade de tapiocas gourmet: ");
	   numtapiocagourmet = lerTeclado.nextInt();
	      
	   System.out.print("Insira os custos : ");
	   gastos = lerTeclado.nextDouble();
	   System.out.println("===========================================================================================================================================");
	
	   
	   valorbruto = (tapiocassimples * numtapioscasimples) + (numtapiocagourmet * tapiocasgourmet);
	   valorliq = valorbruto - gastos;
	   valor1 = numtapioscasimples * tapiocassimples;
	   valor2 = numtapiocagourmet * tapiocasgourmet;
	   valor3 = numtapioscasimples + numtapiocagourmet;
	   
	   System.out.println("A quantidade de tapiocas vendidas foi de: " + valor3);
	   System.out.println("O valor acumulado com as tapiocas simples foi de: " + valor1);
	   System.out.println("O valor acumulado com as tapiocas gourmet foi de: " + valor2);
	   System.out.println("O valor bruto arrecadado foi de: " + valorbruto);
	   System.out.println("Retirando os custos, o arrecadado foi de: " + valorliq);
	   }
	}
