package AcademiaJavaACC;

public class Curso {
	//Atributos da classe
	private double codigo;
	private String nome;
	
	//Construtores
	public Curso() {
	}
	public Curso(double codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	//Métodos Getters e Setters
	public double getCodigo() {
		return codigo;
	}
	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Métodos toString
	public String toString() {
		return "Codigo do curso: " + codigo + "\n" + "Nome do curso: " + nome;
	}
}
