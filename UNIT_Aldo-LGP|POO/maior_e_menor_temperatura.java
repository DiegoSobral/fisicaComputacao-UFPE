import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    double[] temperaturas = new double[7];
    double maiorTemperatura = Integer.MIN_VALUE, menorTemperatura =
      Integer.MAX_VALUE;
    for (int i = 0; i < temperaturas.length; i++)
      {
	System.out.printf ("%dB* temperatura: ", i + 1);
	temperaturas[i] = sc.nextDouble ();
	if (maiorTemperatura < temperaturas[i]){
	    maiorTemperatura = temperaturas[i];
	  }
	else if (menorTemperatura > temperaturas[i]){
	         menorTemperatura = temperaturas[i];
	  }}
	  
    System.out.println ("---------------");
    System.out.printf ("Menor Temperatura: " + menorTemperatura + "Maior Temperatura: " + maiorTemperatura);
  }
}
