package atv;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
  		//Declaração das variáveis.
		
		//1- o nome do funcionário;
		//2- o número de horas trabalhadas por este funcionário;
		//3- e o número de dependentes deste funcionário.		

		final double VALOR_HORA = 32.00;
		
  		String nome; 
  		int numeroHoras;
  		int dependentes;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Nome:");
  		nome = teclado.next();

  		System.out.println("Horas:");
  		numeroHoras = teclado.nextInt();
  		
  		System.out.println("Dependentes:");
  		dependentes = teclado.nextInt();  
  		
  		/*
  			Considerando que:
A. A empresa paga fixo R$32.00 por hora;
B. A empresa paga fixo R$40.00 por dependente;
C. Sobre o salário bruto são feitos descontos fixos de 8.5% para o INSS
D. Sobre o salário bruto são feitos descontos fixos de 5% para o IR;


Faça um algoritmo que leia os dados da ficha do funcionário, calcule:
1- O salário bruto (hora * valorhora + dependente * valordependente)
2- Valor do desconto de INSS (percentual sobre o salario bruto);
3- Valor de desconto de IR (percentual sobre o salario bruto);
4- Valor liquido do salário deste funcionário (Salario Bruto - INSS - IR).
  		*/
  	    double salarioBruto   = numeroHoras * 32 + dependentes * 40;
  	    double valorINSS      = salarioBruto * 8.5 / 100;
  	    double valorIR        = salarioBruto * 5 / 100;
  	    double salarioLiquido = salarioBruto - valorINSS - valorIR;  	
  	    
	  	//Saída
  	    System.out.println("Nome:" + nome);
 		System.out.println("Bruto:" + salarioBruto);
 		System.out.println("INSS:" + valorINSS);
 		System.out.println("IR:" + valorIR);
 		System.out.println("Liquido:" + salarioLiquido);
 		
  		teclado.close();
	}

}
