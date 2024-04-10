import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner lerTeclado = new Scanner(System.in);
   char açao;
   double vida_Player, vida_Boss; 
   int dano_Player = 10, dano_Boss = 7, cura_Player = 5;
   
   System.out.println("Escreva a vida do Player: ");
   vida_Player = lerTeclado.nextDouble();
   System.out.println("Escreva a vida do Boss: ");
   vida_Boss = lerTeclado.nextDouble();
   System.out.println("============================================================");
   
   while (vida_Boss > 0 || vida_Player > 0){
      System.out.println("Tecle A para atacar e C para curar: ");
      System.out.println("Sua vida : vida_Player     Vida do Boss : vida_Boss");
      System.out.println("Seu dano : dano_Player     Dano do Boss : dano_Boss");
      açao = lerTeclado.nextChar();
      
      while (açao == a){ 
      vida_Boss = vida_Boss - dano_Player;
   }
   
      while (açao == c){
      vida_Player = cura_Player - dano_Boss/2;
   }
      
   }
