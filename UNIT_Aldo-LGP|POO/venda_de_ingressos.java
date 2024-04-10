import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   
	   Scanner lerTeclado = new Scanner(System.in);
	   
	   int normal, estudante, acessivel, total1, totaln, totala;
	   double ingressosnorm = 30, ingressosestu = 15, ingressosacess = 30, total2;
	   int vagas, vagasacess, livres; 
	   
	   System.out.print("Os ingressos vendidos normais são: ");
	   normal = lerTeclado.nextInt();
	   
	   System.out.print("Os ingressos vendidos para estudantes são: ");
	   estudante = lerTeclado.nextInt();
	   
	   System.out.print("Os ingressos vendidos acessiveis são: ");
	   acessivel = lerTeclado.nextInt();
	   
	   System.out.print("Quantas cadeiras temos para as vagas normais? ");
	   vagas = lerTeclado.nextInt();
	   
	   System.out.print("E para as acessíveis? ");
	   vagasacess = lerTeclado.nextInt();
	   
	   System.out.println("=============================================================================");
	   
	   if(normal > 0 && estudante > 0 && acessivel > 0){
	    
	   total1 = (normal + estudante + acessivel);
	   total2 = (normal * ingressosnorm) + (estudante * ingressosestu) + (acessivel * ingressosacess);
	   livres = (vagas - normal - estudante) + (vagasacess - acessivel);
	   totaln = (vagas - normal - estudante);
	   totala = (vagasacess - acessivel);
	    
	   if(livres > 0 || totaln > 0 && totala > 0){
	    
	   System.out.println("O total de Ingressos vendidos é: " + total1);
	   System.out.println("E o valor arrecadado é: R$ "+ total2);
	   System.out.println("Temos disponíveis " + livres + " lugares e são : " + totaln + " vagas normais e " + totala + " vagas acessíveis");
}}}}
