package ListaC;

import java.util.Scanner;


public class ListaC {

	public static void main(String[] args) {
		
		Menu();
		
	}
	
	public static void Menu() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("----------------------Lista C------------------------");
		System.out.println("Selecione uma das questoes:");
		System.out.println(" Questao-1\n Questao-2\n Questao-3\n Questao-4");
		System.out.println("-----------------------------------------------------");
		System.out.println(" Escolha pelo numero da questao:\n Digite o numero");
		
		int resp = in.nextInt();
		
		switch(resp) {
		
		case 1:
			QuestaoUm(2,2);
			break;
		
		case 2:
			QuestaoDois(1);
			break;
		
		case 3:
			QuestaoTres(58);
			break;
		
		case 4:
			QuestaoQuatro(1,5);
			
		default:
		    System.out.println("Digite um numero valido");	
		
		}
		
		
	}
	
	public static void QuestaoUm(int a,int b) {
		/*
		  Escreva um m ́etodo est ́atico em Java que recebe dois n ́umeros a e b e retorna a diferen ̧ca de a por b,
		   se a  ́e maior que b, e retorne a soma de a e b caso contrario. 
		 * */
		System.out.println("Questão 1:");
		if(a>b) {
			int diferenca = a - b;
			System.out.println("A diferença de :" + a + " e " + b + " = " + diferenca );
		}else {
			int soma = a + b;
			System.out.println("A soma de :" + a + "+" + b + " = "+ soma);
		}
	}

	public static void QuestaoDois(int n) {
		/*Escreva um m ́etodo est ́atico em Java que recebe um inteiro n e retorna a soma de cada um dos d ́ıgitos
		de n.*/
		System.out.println("Questao 2:");
		int soma = 0;
		for(int i = 0 ; i <= n ; i ++) {
			soma += i;
		}
	        
			System.out.println( "Somatório de "+ n + " = "+ soma );

	}
	
	public static boolean QuestaoTres(int n) {
	
		/*Escreva um m ́etodo est ́atico em Java que recebe um inteiro n e retorna verdadeiro se ele for primo e
		  falso caso contrário (um n ́umero  ́e primo se ele  ́e divisıvel apenas por 1 e ele mesmo).*/
	
		if(n < 2) {
			System.out.println("O numero: " + n +" nao eh primo");
			return false;
		}
		for(int i = 2; i < n; i++) {
			if((n % i) == 0) {
				System.out.println("O numero: " + n +" nao eh primo");
				return false;
			}
		}
		System.out.println("O numero: " + n +" eh primo");
		return true;
	}
	
	public static void QuestaoQuatro(int n, int k) {
		
		//n = moedas exibir enunciado
		//k = quantidade de pessoas
		/*
		 * 	Evan  ́e um cachorro que gosta muito de moedas. Ele encontrou um ba ́u transparente com n moedas
			dentro. Como ele n ̃ao consegue abrir sozinho, ele precisa latir para chamar algu ́em capaz de abrir o
			ba ́u. Evan  ́e capaz de escolher a altura em que ir ́a latir de tal forma a chamar qualquer quantidade de
			pessoas at ́e onde eles est ́a, at ́e um limite de k pessoas. Ao abrirem o ba ́u, as pessoas v ̃ao dividir entre
			si as moedas e deixar as que sobrarem para Evan.
			Escreva um m ́etodo est ́atico em Java que recebe dois inteiros n e k e retorna a quantidade m ́axima
			de moedas que podem sobrar para Evan se ele calcular a altura de seu latido corretamente.
		 * */
		System.out.println("A quantidade de pessoas que Evan chamou foi :" + k);
		System.out.println("A quantidade de moedas no Bau sao :" + n);
		int divisao = n/k;
		int resto = n%k ;
		System.out.println("Cada pessoa ficou com :" + divisao);
		System.out.println("Evan ficou com " + resto + " moedas");
		
		if(resto == 0) {
			System.out.println("Evan ficou triste");
		}else {
			System.out.println("Evan ficou feliz");
		}
		
		
	}

}
