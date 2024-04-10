import java.util.Scanner;
public class Main
{

  public static void main (String[]args)
  {
    Scanner digite = new Scanner (System.in);

    int[] idade = new int[5];
    int totalIdades = 0, maiorIdade = 0, menorIdade = 0;
    double mediaIdades = 0;

    for (int i = 0; i < 5; i++)
      {
	System.out.printf ("%dB* idade: ", (i + 1));
	idade[i] = digite.nextInt ();
      }

    for (int i = 0; i < 5; i++)
      {
	totalIdades += idade[i];
	System.out.println (idade[i]);
	digite.close ();
      }
      
     if (maiorIdade < idades[i]){      
	maiorIdade = idades[i];
      }
      
    else if (menorIdade > idades[i]){
	menorIdade = idades[i];
      }
      
	 System.out.println ("A maior idade é: " + maiorIdade);
	 System.out.println ("A menor idade é: " + menorIdade);
    mediaIdades = totalIdades / idade.length;
    System.out.println ("O total das idades é: " + totalIdades);
    System.out.println ("A média das idades é: " + mediaIdades);
      }

  }
