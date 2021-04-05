package objetos;

public class Aluno {
	public String nome;
	public String s;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	
	public String toString() {
		double soma = primeiraNota + segundaNota + terceiraNota;
		
		if(soma >= 60) {
			s = "APROVADO";
			System.out.printf("NOTAL FINAL = %.2f\n", soma);
			return s;
		} else {
			double pontosRestando = 60 - soma;
			System.out.printf("NOTAL FINAL = %.2f\n", soma);
			s = "REPROVADO";			
			System.out.printf("PONTOS RESTANDO: %.2f\n", pontosRestando);
			return s;
		}	
	}
}
