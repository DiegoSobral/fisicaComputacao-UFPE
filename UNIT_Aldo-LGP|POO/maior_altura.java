import java.util.Scanner;
public class Main
{
	  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  double totalalturas = 0;
	  double altura = 1;
	  float maioraltura = 1;
	  
	  do{
	  System.out.print("Insira uma altura: ");
	  altura = sc.nextDouble();
	  totalalturas += altura;
	  if (altura != 0.0){
	  continue;
	  }
	  else{
	  System.out.println("encerrado");
	  break;
	  }}
	  while (true);
	  if (altura > maioraltura){
	      altura = maioraltura;
	  System.out.println("A altura da pessoa mais alta é: " + maioraltura + " M");  
	       }
	  }
    }

