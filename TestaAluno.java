package AcademiaJavaACC;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Repositorio 
		RepositorioPessoaArray repPessoa = new RepositorioPessoaArray(6);
	
		//Criação de objetos
		Curso curso1 = new Curso(10, "Ciencia da Computacao");
		Curso curso2 = new Curso(10, "Engenharia da Computacao");
		
		Aluno aluno1 = new Aluno("José Almeida", "012.345.678-90", 20, curso1); 
		Aluno aluno2 = new Aluno("Luana Pesqueira", "234.245.126-74", 20, curso2);
				
		Professor professor1 = new Professor("Clodoaldo Oliveira", "472.724.953-18", 47, 3500.00);
		Professor professor2 = new Professor("Cleonice da Costa", "453.295.346.80", 53, 3500.00);
		
		//Inserir no repositorio de Array
		repPessoa.inserir(aluno1); 
		repPessoa.inserir(aluno2); 
		repPessoa.inserir(professor1); 
		repPessoa.inserir(professor2); 
		
		
		//Inicio 
		System.out.println("Bem vindo ao Projeto de Java Básico da Academia Accenture!" + "\n");
		
		//variaveis de controle
		boolean primeiroAluno = true;
		boolean primeiroProfessor = true;
		boolean on = true;
		int escolha;
		
		while (on == true) {
			//Menu
			System.out.println("O que deseja fazer: ");
			System.out.println("1. Cadastrar 1 novo aluno");
			System.out.println("2. Cadastrar 1 novo professor");
			System.out.println("3. Procurar pessoa");
			System.out.println("4. Remover pessoa");
			System.out.println("5. Listagem de dados");
			System.out.println("6. Sair");
			System.out.println("Escolha um numero: ");
			
			escolha = 0;
			int selecao = 0;
			selecao = input.nextInt();
			switch(selecao) {
			
			//Cadastrar 1 novo aluno
			case 1:
				if (primeiroAluno == true) {
					Aluno aluno3 = new Aluno();
					System.out.println("\n" + "Digite o nome: ");
					aluno3.setNome(input.next());
					System.out.println("Digite o cpf: ");
					aluno3.setCpf(input.next());
					System.out.println("Digite a idade: ");
					aluno3.setIdade(input.nextInt());
					System.out.println("Qual o curso: " + "\n" + "1. Ciencia da Computacao" + 
										"\n" + "2. Engenharia da Computacao" );
					escolha = input.nextInt();
					while(escolha != 1 && escolha !=2) {
						System.out.println("Escolha invalida! Por favor, digite 1 ou 2:  ");
						System.out.println("1. Ciencia da Computacao" + "\n" + "2. Engenharia da Computacao");
						escolha = input.nextInt();
					}
					if(escolha == 1) 
						aluno3.setCurso(curso1);
					else
						aluno3.setCurso(curso2);
					
					//Inserir no repositorio de Array e atualizar variável de controle
					repPessoa.inserir(aluno3);
					primeiroAluno = false;
					System.out.println("\n" + "Aluno cadastrado!" + "\n");
				}
				else {
					System.out.println("\n" + "! Limite de alunos cadastrados atingido !");
					System.out.println("Não será possível realizar mais cadastros de aluno");
				}
				break;
			
				
			//Cadastrar 1 novo professor
			case 2:
				if (primeiroProfessor == true) {
					Professor professor3 = new Professor();
					System.out.println("\n" + "Digite o nome: ");
					professor3.setNome(input.next());
					System.out.println("Digite o cpf: ");
					professor3.setCpf(input.next());
					System.out.println("Digite a idade: ");
					professor3.setIdade(input.nextInt());
					System.out.println("Digite o salario: ");
					professor3.setSalario(input.nextDouble());
					
					repPessoa.inserir(professor3);
					primeiroProfessor = false;
					System.out.println("\n" + "Professor cadastrado!" + "\n");
				}
				else {
					System.out.println("\n" + "! Limite de professores cadastrados atingido !");
					System.out.println("Não será possível realizar mais cadastros de professor");
				}
				break;
					
				
			//Procurar pessoa	
			case 3:
				System.out.println("\n" + "Digite o CPF: ");
				Pessoa procurado = repPessoa.procurar(input.next()); 
				if(procurado == null)
					System.out.println("\n" + "Não há pessoa cadastrada com esse CPF!");
				else
					System.out.println("\n" + "Pessoa encontrada!" + "\n" + procurado.toString());
				
				break;
			
				
			//Remover pessoa
			case 4:
				System.out.println("\n" + "Digite o CPF: ");
				String auxiliar = input.next();
				procurado = repPessoa.procurar(auxiliar);
				if(procurado == null)
					System.out.println("\n" + "Não há pessoa cadastrada com esse CPF!");
				else {
					repPessoa.remover(auxiliar);
					System.out.println("\n" + "Pessoa removida!" + "\n" + "Nome: " + procurado.toString());
				}	
				break;
				
				
			//Listagem de dados	
			case 5:
				System.out.println("\n" + "Escolha uma opção: ");
				System.out.println("1. Listagem de Alunos");
				System.out.println("2. Listagem de Professores");
				System.out.println("3. Listagem de Cursos");
				escolha = input.nextInt();
				while(escolha>3 || escolha<1) {
					System.out.println("Opção Invalida!");
					System.out.println("Escolha uma opção: ");
					escolha = input.nextInt();
				}
				
				//Listagem de Alunos
				if(escolha == 1) {
					
				}
				
				break;
				
				
			//Sair
			case 6:
				on = false;
				break;
				
				
			//Opção inválida	
			default:
				System.out.println("Opcao invalida! Por favor, escolha um numero válido!");
				break;							
			}
			
			System.out.println("\n" + "\n" + "Pressione qualquer tecla + Enter...");
			input.next();
			
			
		}
		
		System.out.println("\n" + "\n" + "Encerrando...");
		System.out.println("Até logo! :)");
		input.close();	
	}
}
