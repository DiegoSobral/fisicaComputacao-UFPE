import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   double tamanhodoresevatorio, nivelderegulagem, tempodecorrido;
	   
	   System.out.print("Insira o tamanho do reservatório em litros: ");
	   tamanhodoresevatorio = lerTeclado.nextDouble();
	   System.out.print("Insira o nível da vazão: ");
	   nivelderegulagem = lerTeclado.nextDouble();
	   System.out.println("============================================================================================================");
	   
	   if (nivelderegulagem == 1) {
	   tempodecorrido = tamanhodoresevatorio / 12.5;
	   System.out.println("O tempo em minutos para encher o carro pipa foi de: " + tempodecorrido + " minutos");
	   }
	   else if(nivelderegulagem == 2){
	   tempodecorrido = tamanhodoresevatorio / 25;
	   System.out.println("O tempo em minutos para encher o carro pipa foi de: " + tempodecorrido + " minutos");
	   }
	   else if (nivelderegulagem == 3){ 
	   tempodecorrido = tamanhodoresevatorio / 50;
	   System.out.println("O tempo em minutos para encher o carro pipa foi de: " + tempodecorrido + " minutos");
	   }
	   else {
	   System.out.println("Os dados inseridos estão errados");   
	   }}}
