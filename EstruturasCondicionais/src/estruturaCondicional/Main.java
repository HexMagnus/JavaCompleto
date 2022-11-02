package estruturaCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int hora;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12 ) {
		System.out.println("Bom dia");
		}
		else if(hora  <18) {
			System.out.println("Boa tarde");
			}
			else {
		System.out.println("Boa noite");
			}
		sc.close();
				
			
		}
	}

//V: executa somente o bloco do if
//F: executa somente o bloco do else

//if (condicao1) {
//	comando 1
//	comando 2
//}

//else {

// if(condicao 2){
//	comando 3
//	comando 4
//}

//else{
// comando 5
// comando 6

//}

//}
