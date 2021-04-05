package objetos;

public class Conversor_de_moedas {
	
	public static double conversor(double valor, double dolar) {		
		double total = dolar * valor;
		double iof = (total * 6) / 100;
		return total + iof;
	}
	
}
