package objetos;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumento(double porcentagem) {
		return (salarioBruto * porcentagem) / 100 + salarioLiquido();
	}
}
