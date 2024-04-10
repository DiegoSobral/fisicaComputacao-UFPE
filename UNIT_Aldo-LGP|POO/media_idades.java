import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int totalIdades =0;
	  for(int i = 0; i < 6; i++){
	  System.out.print("Insira uma idade: ");
	  int idade = sc.nextInt();
	  totalIdades += idade;
	  }
	  
	  int media = totalIdades/6;
	  System.out.println("===========================================================");
     System.out.println("A média da idade é de: "+ media);
	  sc.close();
	  }}
