package objetos;

public class Aluno {
	public String nome;
	public String email;
	public String s;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;

	public Aluno(){
	}

	public Aluno(String nome, String email){
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
