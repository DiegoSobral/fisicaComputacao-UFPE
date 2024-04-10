import java.util.Scanner;
public class Main{

  public static void main (String[]args){
      
   Scanner lerTeclado = new Scanner (System.in);

   int operacao = 1;
   double montanteguardado, transacao;
   int[] repeticoes = new int[5];
   float totalApurado = 0;

   System.out.println ("Bem vindo ao sistema do Banco");
   System.out.println ("");
   
   for (int i = 0; i < repeticoes.length; i++) {
      while (operacao == 1 || operacao == 2){
	   System.out.println ("Selecione uma transação: ");
	   System.out.println ("1 = Depósito");
	   System.out.println ("2 = Saque");
   	System.out.println ("");
	   operacao = lerTeclado.nextInt();
   	System.out.println("");
   	System.out.print("Insira o Valor da Operação: ");
   	transacao = lerTeclado.nextDouble();
   	System.out.println("==============================================================");
    
      if (operacao == 1 || operacao == 2){
	
	      if (operacao == 1){
	      totalApurado += transacao;
	      }
	    
	      else if (operacao == 2){
      	totalApurado -= transacao;
      	}
}  
      else{
      	System.out.println ("digite um número válido");
       	System.out.println("");
      	System.out.println("==============================================================");
      	}
      }
	    System.out.println ("O saldo final é de: " + totalApurado);
	    break;
	    }
     }
   }
