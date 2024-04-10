import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int valorbruto, numdependentes, impostoderenda;
	   
	   System.out.print("Insira a sua renda bruta mensal: ");
	   valorbruto = lerTeclado.nextInt();
	   
	   System.out.print("Insira o número de dependentes: ");
	   numdependentes = lerTeclado.nextInt();
	  
	  	System.out.println("==========================================================================================================================");
	   
	   impostoderenda = valorbruto - (1000 * numdependentes);
	   
	   if (impostoderenda > 0){
	   System.out.println("O valor a ser pago é: R$ " + impostoderenda);
	   } 
	   
	   else{ 
	   System.out.println("O valor a ser pago é: R$ 0 e o valor do desconto por dependente é de R$ " + valorbruto);
	   
	}}}
