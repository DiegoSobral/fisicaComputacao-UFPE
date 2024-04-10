import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int valordacompra, tipodecompra; 
	   double descontoavista = 0.1, descontogeral = 0.05;
	   double valordodesconto, valorapagar;
	   
	   System.out.print("Insira o valor da compra: ");
	   valordacompra = lerTeclado.nextInt();
	   System.out.print("Insira o método de pagamento: ");
	   tipodecompra = lerTeclado.nextInt();
	   
	   System.out.println("============================================================================================================");
	   
	   if (tipodecompra == 1){
	   valordodesconto = valordacompra * descontoavista;   
	   valorapagar = valordacompra - valordodesconto;
	   
	   System.out.println("O valor sem descontos é: R$ " + valordacompra);
	   System.out.println("O desconto foi de: R$ " + valordodesconto);
	   System.out.println("O valor a pagar vai ser de: R$" + valorapagar);
	   }
	   else{ valordodesconto = valordacompra * descontogeral;   
	   valorapagar = valordacompra - valordodesconto;  
	   
	   System.out.println("O valor sem descontos é: R$ " + valordacompra);
	   System.out.println("O desconto foi de: R$ " + valordodesconto);
	   System.out.println("O valor a pagar vai ser de: R$" + valorapagar);
	   }}}
