package br.com.codenation.aceleradev.rec.loja;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Digite o cpf: ");
         String cpf = s.nextLine();
         
         System.out.println("Bem vindo usuário!");
         
         System.out.println("Escolha uma categoria:");
         System.out.println("1- Shows");
         System.out.println("2- Filmes");
         System.out.println("3- Softwares");
	}
}
