package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int numero01 = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int numero02 = sc.nextInt();
		
		int diferenca = difFunc(numero01,numero02);
		
		if(diferenca == 0) {
			System.out.println("ParametrosInvalidosException");
		}
		else {
			for(int x = 1 ; x <= diferenca ; x++ ) {
				System.out.println("Imprimindo o número "+ x );
			}
		
		}
		
		sc.close();
	}
	
	static int difFunc(int num01, int num02) {
		
		if(num01 > num02){
			return 0;
		}
		else{
			return num02 - num01 ; 
		}
		
		}
	}

