package br.edu.ifrs.canoas.lpoo2.aula01.funcionario;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	void bonifica(double aumento) {
		this.salario += aumento;
	}
	
	void demite(){
		
	}

}
