package AcademiaJavaACC;

public class Professor extends Pessoa {
	//Atributo da classe
	private double salario;
		
	//Construtores	
	public Professor(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
	}
	public Professor() {
		super();
	}

	//Metodos Getters e Setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Método toString
	public String toString() {
		return super.toString() + "\n" + "Salario: " + salario;
	}
}