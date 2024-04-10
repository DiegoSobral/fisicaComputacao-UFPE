import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int dias, horas, resultado, transformar = 24;
	   
	   System.out.print("Insira os dias de duração da viagem: ");
	   dias = lerTeclado.nextInt();
	   
	   System.out.print("Insira as horas de duração da viagem: ");
	   horas = lerTeclado.nextInt();
	   System.out.println("===================================================");
	   
	   if (dias > 0 && horas > 0){ 
	   resultado = horas + (dias * transformar);
	   
	   System.out.println("A duração da viagem foi de: " + resultado + " Horas");
		}
	}
}

