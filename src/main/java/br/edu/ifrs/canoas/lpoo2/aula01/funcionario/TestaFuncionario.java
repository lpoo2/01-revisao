package br.edu.ifrs.canoas.lpoo2.aula01.funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario meuFuncionario = new Funcionario();
		
		meuFuncionario.nome = "Rodrigo";
		meuFuncionario.salario = 1000;
		meuFuncionario.bonifica(100);
		
		System.out.println("Salario atual: " + meuFuncionario.salario);
	}

}
