import java.math.BigInteger;

public class Hilo extends Thread {
	public static int totalPrimos;
	public String nombre;
	public int rangoInicial;
	public int rangoFinal;

	Hilo(int rangoInicial, int rangoFinal) {
		super();
		this.rangoInicial = rangoInicial;
		this.rangoFinal = rangoFinal;
	}

	public void run() {
		for (int i = rangoInicial; i <= rangoFinal; i++) {
			esPrimo(i);
		}
	}

	public static void esPrimo(int numeroPrimo) {
		boolean primo = false;
		BigInteger bigInteger = new BigInteger(String.valueOf(numeroPrimo));
		primo = bigInteger.isProbablePrime(numeroPrimo);
		if (primo != false) {
			System.out.println(numeroPrimo);
		}
	}

}
