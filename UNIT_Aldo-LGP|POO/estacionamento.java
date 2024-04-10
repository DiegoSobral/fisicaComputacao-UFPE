import java.util.Scanner;
public class Main{

  public static void main (String[]args){
      
   Scanner lerTeclado = new Scanner (System.in);

   int tipo_Veiculo;
   int valorDoAutopasseio = 50, valorDaVan = 100, valorDoOnibus = 200;
   double horadaEntrada;
   float totalApurado = 0;

   System.out.println ("Bem vindo ao sistema do estacionamento");
   System.out.println ("tecle uma número valido para continuar: ");
   System.out.println ("Números validos: 1, 2 e 3 ");
   tipo_Veiculo = lerTeclado.nextInt ();
   System.out.println ("");
   System.out.println ("=============================================");

   while (tipo_Veiculo == 1 || tipo_Veiculo == 2 || tipo_Veiculo == 3){
	System.out.println ("Selecione um tipo de veiculo ou encerre o programa para obter o total:");
	System.out.println ("1 = Auto passeio (50 reais a diária)");
	System.out.println ("2 = Van (100 reais a diária)");
	System.out.println ("3 = Onibus (200 reais a diária)");
	System.out.println ("0 = Encerrar programa");
	System.out.println ("");
	tipo_Veiculo = lerTeclado.nextInt ();
   System.out.println ("Os horários válidos são das 7 às 17");
	System.out.println ("Hora de entrada do veiculo: ");
	
	horadaEntrada = lerTeclado.nextDouble ();
	System.out.println("");
	System.out.println("==============================================================");
    
   if (horadaEntrada >= 7 && horadaEntrada <= 17){
    
	    if (horadaEntrada >= 13 && tipo_Veiculo == 1){
	    totalApurado += valorDoAutopasseio / 2;
	    }
	    if (horadaEntrada >= 13 && tipo_Veiculo == 2){
	    totalApurado += valorDaVan / 2;
	    }
	    if (horadaEntrada >= 13 && tipo_Veiculo == 3){
	    totalApurado += valorDoOnibus / 2;
	    }
	    else if (tipo_Veiculo == 1){
	    totalApurado += valorDoAutopasseio;
	    }
	    else if (tipo_Veiculo == 2){
	    totalApurado += valorDaVan;
	    }
	    else if (tipo_Veiculo == 3){
	    totalApurado += valorDoOnibus;
	    }
	    else{
	    System.out.println ("digite uma número válido");
	    System.out.println("");
	    System.out.println("==============================================================");
	    }
   }
   else 
   System.out.println("insira um horário válido");
   System.out.println("");
	System.out.println("==============================================================");
    
	while (tipo_Veiculo == 0){
	    System.out.println ("O total apurado foi de: " + totalApurado);
	    break;
	  }
    }
  }
}
