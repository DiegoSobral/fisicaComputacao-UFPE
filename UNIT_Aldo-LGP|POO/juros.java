import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   double valor_parcela, jurosdiário, diasdeatraso, valor_final;
	   
	   System.out.print("Insira o valor da parcela: ");
	   valor_parcela = lerTeclado.nextDouble();
	   
	   System.out.print("Insira os dias de atraso: ");
	   diasdeatraso = lerTeclado.nextDouble();
	   
	   System.out.print("Insira o valor dos juros: ");
	   jurosdiário = lerTeclado.nextDouble();
	   
	   valor_final = (valor_parcela / 100 * jurosdiário * diasdeatraso) + valor_parcela;
	   
	   System.out.println("O valor da parcela atrasado foi de: R$" + valor_final);
	}}
