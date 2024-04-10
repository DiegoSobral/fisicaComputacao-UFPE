import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner lerTeclado = new Scanner(System.in);
	   double litrosGasolina, litrosEtanol, metrognv, total, total1, total2, total3;
	   double gasolina = 7.199, etanol = 5.419, gnv = 4.259;
	   
	   System.out.print("Insira os litros de gasolina usados: ");
	   litrosGasolina = lerTeclado.nextDouble();
	      
	   System.out.print("Insira os litros de etanol usados: ");
	   litrosEtanol = lerTeclado.nextDouble();
	      
	   System.out.print("Insira a quantidade de GNV usada: ");
	   metrognv = lerTeclado.nextDouble();
	   
	   System.out.println("===========================================================================================================================================");
	   
	   if (litrosGasolina > 0 && litrosEtanol > 0 && metrognv > 0){ 
	   total = (litrosGasolina * gasolina) + (litrosEtanol * etanol) + (metrognv * gnv);
	   total1 = litrosGasolina * gasolina;
	   total2 = litrosEtanol * etanol;
	   total3 = metrognv * gnv;
	   System.out.println("O total recebido foi: " + total + "R$. Separando temos:" + total1 + "R$ de Gasolina, " + total2 + "R$ de Etanol e " + total3 + "R$ de GNV");
	}}}
