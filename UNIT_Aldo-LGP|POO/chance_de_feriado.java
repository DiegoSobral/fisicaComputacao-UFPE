import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   double temperatura;
	   
	   System.out.print("Insira a temperatura no inicio do mês: ");
	   temperatura = lerTeclado.nextDouble();
	   
	   System.out.println("============================================================================================================");
	   
	   if (temperatura > 0){
	   System.out.println("Não haverá feriado");
	   }
	   else {
	   System.out.println("Haverá feriado");   
	   }}}
