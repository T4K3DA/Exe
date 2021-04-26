package atv;
import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		
	    // Declaração de variáveis

		String nome = "";
		String sobrenome = "";
		String estado = "";
		int anoNascimento;
		int idade;
		int anoAtual = 2021;
		int categoria;
		int aposentado = 0;
		int desempregado;
		int qtdFuncionarios;
		int sair = 1;
		int resposta;
		double empregador;
		double beneficio;
		double empregado;
		double valor;
		
		// Entrada de dados
		
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println(String.valueOf("Olá, seja bem-vindo ao programa de beneficiários!\nSiga as instruções e veja seu beneficio ao final do programa\n"));
	    
	    while (sair != 4) {
	    
	    System.out.println("Por favor, informe seu nome");
        nome = teclado.next();
        
        System.out.println("Por favor, informe seu sobrenome");
        sobrenome = teclado.next();
        
        System.out.println(String.valueOf("\nOlá, " + nome + sobrenome));
        System.out.println(nome + ", por favor, informe sua data de nascimento\n");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        
        if (idade >= 18) {
            System.out.println(String.valueOf("Digite estado (UF) onde você mora"));
     	    estado = teclado.next();
     	    System.out.println(String.valueOf("Você está morando no estado: " + estado));
	        System.out.println(String.valueOf("\nDigite o número correspondente a sua categoria:\n 1 - Empregado\n 2 - Empregador\n 3 - Desempregado\n"));
	        categoria = teclado.nextInt();
	    
	    
	    // EMPREGADO
	      
	    if (categoria == 1){
            System.out.println(String.valueOf("Você está com a categoria EMPREGADO"));
            System.out.println("\nDigite o valor atual do seu beneficio para cálculo");
            beneficio = teclado.nextInt();
            
        if (beneficio >= 1000 && beneficio <=1800){
            System.out.println(String.valueOf("Você é aposentado?\n 1 - Sim\n 2 - Não"));
            aposentado = teclado.nextInt();
            valor = beneficio + beneficio * 0.30;
                    
        if (aposentado == 1) {
            System.out.println(String.valueOf("AVISO: Para aposentados, existe um acréscimo de 30% no benefício\nO benefício terá 6 meses de duração\n"));
            System.out.println(String.valueOf("Você receberá " + valor));
            
        }else {
            System.out.println(String.valueOf("Seu benefício será entre R$1.000 e R$1.800"));
        }
       
        }else{
            System.out.println("\nERRO! Seu beneficio tem um valor irregular com base em sua categoria");
        }
            System.out.println(String.valueOf("Deseja informar um novo usuário?\n1 - Sim\n2 - Não"));
            resposta = teclado.nextInt();
            
        if (resposta == 2) {
            break;
        } 
        }
	    
	    
	    // EMPREGADOR 
	    
	    if (categoria == 2){
	        System.out.println(String.valueOf("Você está com a categoria EMPREGADOR"));
	        System.out.println(String.valueOf("Você tem quantos funcionários?"));
	        qtdFuncionarios = teclado.nextInt();
	        
	    if (qtdFuncionarios <= 10)   { 
	        beneficio = qtdFuncionarios * 200;
	        empregador = beneficio + beneficio * 0.18;
	        System.out.println(String.valueOf("Você receberá:" + empregador));
	        
	    }else {
            System.out.println(String.valueOf("Seu benefício será " + qtdFuncionarios * 200));
	    }
	    
	        System.out.println(String.valueOf("AVISO: Para empregadores que tenham até 10 funcionários haverá um acréscimo de 18% sobre o valor total\nO Benefício será de 10 meses para empregadores com até 10 funcionários\n"));
	        System.out.println(String.valueOf("Deseja informar um novo usuário?\n1 - Sim\n2 - Não"));
            resposta = teclado.nextInt();
        
        if (resposta == 2) {
            break;
        } 
	    }
	    
	    
	    // DESEMPREGADO
	        
	    if (categoria == 3){
	        System.out.println(String.valueOf("Você está com a categoria DESEMPREGADO"));
	        System.out.println(String.valueOf("Você está desempregado há quantos meses?"));
	        desempregado = teclado.nextInt();     
	        System.out.println(String.valueOf("Seu beneficio será entre R$ 1.500 e R$ 2.300"));  
	    	System.out.println(String.valueOf("AVISO: O benefício terá 6 meses de duração\n"));
	    	System.out.println(String.valueOf("Deseja informar um novo usuário?\n1 - Sim\n2 - Não"));
	        resposta = teclado.nextInt();
	            
	    if (resposta == 2) {
	        break;
	        } 
	    }
	    
        }else {
            System.out.println(String.valueOf("Você não é maior de 18 anos, e por isso, não terá autorização para\nparticipar do programa de beneficiários."));
            System.out.println(String.valueOf("Deseja informar um novo usuário?\n1 - Sim\n2 - Não"));
            resposta = teclado.nextInt();
            
        if (resposta == 2) {
            break;
        } 
        }
        
	  }
   }
}
