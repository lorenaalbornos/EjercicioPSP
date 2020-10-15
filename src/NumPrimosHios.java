import java.util.Scanner;

public class NumPrimosHios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos hilos quieres que se creen para que te muestre los numeros primos?");
		int numHilos = teclado.nextInt();
		int rangoInicial = 0;
		int rangoFinal = 0;
		int ultimoNumero = 100000;
		Hilo hilo;
		for (int i = 1; i <= numHilos; i++) {
			rangoInicial = (ultimoNumero / numHilos) * (i - 1);
			if (i == numHilos) {
				rangoFinal = ultimoNumero;
			} else {
				rangoFinal = ((ultimoNumero / numHilos) * (i));
			}
			if (i == 1) {
				rangoInicial = 1;
			} else {
				rangoFinal = ((ultimoNumero / numHilos) * (i));
			}
			System.out.println("Hilo " + i + " de " + rangoInicial + " a " + rangoFinal);
			hilo = new Hilo(rangoInicial, rangoFinal);
			hilo.start();
		}
	}

}
