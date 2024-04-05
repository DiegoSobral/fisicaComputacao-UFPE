public class Main {

	public static void main(String[] args)  
	    throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double nota1=-1, nota2=-1;

		// LE NOTA 1:
		while (nota1 < 0 || nota1 > 10){
			nota1 = sc.nextDouble();
			if (nota1 < 0 || nota1 > 10)
				System.out.println("nota invalida");
		}
		// LE NOTA 2:
		while (nota2 < 0 || nota2 > 10){
			nota2 = sc.nextDouble();
			if (nota2 < 0 || nota2 > 10)
				System.out.println("nota invalida");
		}
		System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
		sc.close();
	}
}
