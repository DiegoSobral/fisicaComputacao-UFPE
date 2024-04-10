import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        
        final double[] PRECO_GRAMA = {0, 0.16, 0.14, 0.12};
        final String[] ALIMENTO = {"", "Carne", "Peixe", "Ave"};
        
        final double PRATO_MINIMO = 20;
        
        int tipoAlimento;
        double pesoAlimento;
        double precoAlimento;
        double totalPrato = 0;
        
        do {
            
            System.out.print("Tipo do alimento 1-Carne / 2-Peixe / 3-Ave / 9-Finaliza prato / 0-Finaliza programa: ");
            tipoAlimento = lerTeclado.nextInt();
            if (tipoAlimento == 0 || tipoAlimento==9) {
                break;
            }
            
            if (tipoAlimento<0 || tipoAlimento>3) {
                System.out.println("Tipo incorreto");
                continue;
            }
            
            System.out.print( ALIMENTO[tipoAlimento] );

            System.out.print(" - Peso: ");
            pesoAlimento = lerTeclado.nextDouble();
            
            precoAlimento = pesoAlimento * PRECO_GRAMA[tipoAlimento];
            totalPrato += precoAlimento;  // totalPrato = totalPrato + precoAlimento;
            
            System.out.printf("%s - Preço da porção: R$ %.2f\n",  ALIMENTO[tipoAlimento], precoAlimento );

        } while (true);
        
        if (tipoAlimento == 9){
            if (totalPrato<PRATO_MINIMO) {
               totalPrato = PRATO_MINIMO;
            }
            System.out.printf("Total do prato: R$ %.2f", totalPrato); 
        }
        else {
            System.out.println("Fim do programa");
        }

	}
}
