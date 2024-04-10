import java.util.Scanner;

public class Main
{
  public static void main (String[]args){
     
   Scanner sc = new Scanner (System.in);
   
   final int pratoMinimo = 20;
   int tipodeCarne;
   double pesodaCarne = 0, preçodoPrato = 0, precoAlimento = 0;
      
   do{ 
      System.out.println ("1 - Carne: R$ 0,16");
      System.out.println ("2 - Peixe: R$ 0,14");
      System.out.println ("3 - Ave:   R$ 0,12");
      System.out.println ("9 - Encerrar o Programa");
      System.out.println("===================================");
      System.out.print ("Insira o tipo da carne: ");
      tipodeCarne = sc.nextInt();
      
      if (tipodeCarne != 9){
      
      System.out.println("===================================");
      System.out.print ("Insira o tipo da carne: ");
      tipodeCarne = sc.nextInt();
      System.out.print("Insira o peso em gramas: ");
      System.out.println("");
      System.out.println("Se deseja saber o valor final digite 5");
      pesodaCarne = sc.nextDouble ();
      
   if (tipodeCarne == 1){
   preçodoPrato = pesodaCarne * 0.16;
      
      if (preçodoPrato > pratoMinimo){
         preçodoPrato += precoAlimento;
      }
      
      else
         System.out.println("Não atinge o Valor mínimo");
      }
      
   }

   if(tipodeCarne == 2){
   preçodoPrato = pesodaCarne * 0.14;
      
      if (preçodoPrato > pratoMinimo){
         preçodoPrato += precoAlimento;
      }
      else
         System.out.println("Não atinge o Valor mínimo");
      }
   
	if(tipodeCarne == 3){
	preçodoPrato = pesodaCarne * 0.12;
	   
	   if (preçodoPrato > pratoMinimo){
         preçodoPrato += precoAlimento;
	   }
      else
         System.out.println("Não atinge o Valor mínimo");
   	}
	
   if(tipodeCarne == 5){
   System.out.println("O valor final é de: R$ " + preçodoPrato);
   }
	else
	    System.out.println ("Insira um número válido");
	    break;
   }while (true);
   
  }

}

