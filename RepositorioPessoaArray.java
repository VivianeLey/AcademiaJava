package AcademiaJavaACC;

public class RepositorioPessoaArray {
	//Atributos da classe
	private Pessoa[] pessoa;
	private int indice;
	
	//Construtor
	public RepositorioPessoaArray(int tamanho) {
		indice = 0;
		pessoa = new Pessoa[tamanho];		
	}

	//Método inserir Pessoa
	public void inserir(Pessoa a) {
		pessoa[indice] = a;
		indice = indice + 1;
	}
	
	/* Método procurar Pessoa
		i = contador
		j = variavel auxiliar */
	public Pessoa procurar(String numCPF) {
		Pessoa procurado = null; 
		for(int i=0; i<indice; i++) { 
			Pessoa aux = this.pessoa[i]; 
			
			if(aux.getCpf().equals(numCPF)) 
				procurado = aux;  
		}
		return procurado;
	}
	
	//Método remover Pessoa
	public void remover(String numCPF) {
		for(int i=0; i<indice; i++) {
			Pessoa aux = this.pessoa[i];
			if(aux.getCpf().equals(numCPF)) {
				this.pessoa[i] = this.pessoa[indice-1];
				this.pessoa[indice-1] = null;
				indice = indice - 1;
			}
		}
	}
	
}
