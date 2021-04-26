package atv;
import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		
	    // Declara��o de vari�veis

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
	    
	    System.out.println(String.valueOf("Ol�, seja bem-vindo ao programa de benefici�rios!\nSiga as instru��es e veja seu beneficio ao final do programa\n"));
	    
	    while (sair != 4) {
	    
	    System.out.println("Por favor, informe seu nome");
        nome = teclado.next();
        
        System.out.println("Por favor, informe seu sobrenome");
        sobrenome = teclado.next();
        
        System.out.println(String.valueOf("\nOl�, " + nome + sobrenome));
        System.out.println(nome + ", por favor, informe sua data de nascimento\n");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        
        if (idade >= 18) {
            System.out.println(String.valueOf("Digite estado (UF) onde voc� mora"));
     	    estado = teclado.next();
     	    System.out.println(String.valueOf("Voc� est� morando no estado: " + estado));
	        System.out.println(String.valueOf("\nDigite o n�mero correspondente a sua categoria:\n 1 - Empregado\n 2 - Empregador\n 3 - Desempregado\n"));
	        categoria = teclado.nextInt();
	    
	    
	    // EMPREGADO
	      
	    if (categoria == 1){
            System.out.println(String.valueOf("Voc� est� com a categoria EMPREGADO"));
            System.out.println("\nDigite o valor atual do seu beneficio para c�lculo");
            beneficio = teclado.nextInt();
            
        if (beneficio >= 1000 && beneficio <=1800){
            System.out.println(String.valueOf("Voc� � aposentado?\n 1 - Sim\n 2 - N�o"));
            aposentado = teclado.nextInt();
            valor = beneficio + beneficio * 0.30;
                    
        if (aposentado == 1) {
            System.out.println(String.valueOf("AVISO: Para aposentados, existe um acr�scimo de 30% no benef�cio\nO benef�cio ter� 6 meses de dura��o\n"));
            System.out.println(String.valueOf("Voc� receber� " + valor));
            
        }else {
            System.out.println(String.valueOf("Seu benef�cio ser� entre R$1.000 e R$1.800"));
        }
       
        }else{
            System.out.println("\nERRO! Seu beneficio tem um valor irregular com base em sua categoria");
        }
            System.out.println(String.valueOf("Deseja informar um novo usu�rio?\n1 - Sim\n2 - N�o"));
            resposta = teclado.nextInt();
            
        if (resposta == 2) {
            break;
        } 
        }
	    
	    
	    // EMPREGADOR 
	    
	    if (categoria == 2){
	        System.out.println(String.valueOf("Voc� est� com a categoria EMPREGADOR"));
	        System.out.println(String.valueOf("Voc� tem quantos funcion�rios?"));
	        qtdFuncionarios = teclado.nextInt();
	        
	    if (qtdFuncionarios <= 10)   { 
	        beneficio = qtdFuncionarios * 200;
	        empregador = beneficio + beneficio * 0.18;
	        System.out.println(String.valueOf("Voc� receber�:" + empregador));
	        
	    }else {
            System.out.println(String.valueOf("Seu benef�cio ser� " + qtdFuncionarios * 200));
	    }
	    
	        System.out.println(String.valueOf("AVISO: Para empregadores que tenham at� 10 funcion�rios haver� um acr�scimo de 18% sobre o valor total\nO Benef�cio ser� de 10 meses para empregadores com at� 10 funcion�rios\n"));
	        System.out.println(String.valueOf("Deseja informar um novo usu�rio?\n1 - Sim\n2 - N�o"));
            resposta = teclado.nextInt();
        
        if (resposta == 2) {
            break;
        } 
	    }
	    
	    
	    // DESEMPREGADO
	        
	    if (categoria == 3){
	        System.out.println(String.valueOf("Voc� est� com a categoria DESEMPREGADO"));
	        System.out.println(String.valueOf("Voc� est� desempregado h� quantos meses?"));
	        desempregado = teclado.nextInt();     
	        System.out.println(String.valueOf("Seu beneficio ser� entre R$ 1.500 e R$ 2.300"));  
	    	System.out.println(String.valueOf("AVISO: O benef�cio ter� 6 meses de dura��o\n"));
	    	System.out.println(String.valueOf("Deseja informar um novo usu�rio?\n1 - Sim\n2 - N�o"));
	        resposta = teclado.nextInt();
	            
	    if (resposta == 2) {
	        break;
	        } 
	    }
	    
        }else {
            System.out.println(String.valueOf("Voc� n�o � maior de 18 anos, e por isso, n�o ter� autoriza��o para\nparticipar do programa de benefici�rios."));
            System.out.println(String.valueOf("Deseja informar um novo usu�rio?\n1 - Sim\n2 - N�o"));
            resposta = teclado.nextInt();
            
        if (resposta == 2) {
            break;
        } 
        }
        
	  }
   }
}
