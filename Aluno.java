package AcademiaJavaACC;

public class Aluno extends Pessoa{
	//Atributo da classe
	private Curso curso;
	
	//Construtores	
	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super(nome, cpf, idade);
		this.curso = curso;
	}	
	public Aluno() {
		super();
	}

	//M�todos Getters e Setters
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	//M�todos toString
	public String toString() {
		return super.toString() + "\n" + curso;
	}
}