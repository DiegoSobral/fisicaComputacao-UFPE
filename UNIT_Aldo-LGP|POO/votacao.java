import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   int numdevotos_01, numdevotos_02, numdevotos_03;
	   
	   System.out.print("Insira a quantidade de votos do 1º candidato: ");
	   numdevotos_01 = lerTeclado.nextInt();
	   System.out.print("Insira a quantidade de votos do 2º candidato: ");
	   numdevotos_02 = lerTeclado.nextInt();
	   System.out.print("Insira a quantidade de votos do 3º candidato: ");
	   numdevotos_03 = lerTeclado.nextInt();
	   
	   System.out.println("============================================================================================================");
	   if (numdevotos_01 > 0 && numdevotos_02 > 0 && numdevotos_03 > 0){ 
	   
	   if (numdevotos_01 > numdevotos_02 + numdevotos_03 || numdevotos_02 == numdevotos_03) {
	   System.out.println("O 1º candidato ganhou com: " + numdevotos_01 + " votos");
	   }
	   else if(numdevotos_02 > numdevotos_01 + numdevotos_03 || numdevotos_01 == numdevotos_03){
	   System.out.println("O 2º candidato ganhou com: " + numdevotos_02 + " votos");
	   }
	   else if (numdevotos_03 > numdevotos_01 + numdevotos_02 || numdevotos_01 == numdevotos_02){ 
	   System.out.println("O 3º candidato ganhou com: " + numdevotos_03 + " votos");
	   }
	   else {
	   System.out.println("Haverá Segundo turno");   
	   }}}}
