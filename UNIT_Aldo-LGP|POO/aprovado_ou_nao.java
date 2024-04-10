import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  double media, notadafinal, notasemestre;
	  
	  System.out.print("Insira a média: ");
	  media = sc.nextDouble();
	  
	  if (media >= 6){
	  System.out.println("Aprovado");
	  }
	  
	  if(media >= 3 && media < 6){
	  System.out.print("Insira a nota da final: ");
	  notadafinal = sc.nextDouble();   
	  notasemestre = (media + notadafinal)/2;
	  
	  if (notasemestre >= 6){
	  System.out.println("Aprovado na final");
	  }
	  
	  else if (notasemestre < 6){
	  System.out.println("Reprovado na final");
	  }
	  
	  else
	  System.out.println("Reprovado");
	  }}}
