package br.com.codenation.aceleradev.rec.loja;

import java.util.Scanner;

import br.com.codenation.aceleradev.rec.loja.DAO.UsuarioDao;

public class App {
	
	public static void main(String[] args) {
		String result = null;
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o cpf: ");
	        String cpf = s.nextLine();
	        UsuarioDao usuDao = new UsuarioDao();
	        result = usuDao.existeCpf(cpf);
	        if(result != null) {
	        	break;
	        }
		}
         
         System.out.println("Bem vindo usuário!");
         System.out.println("Escolha uma categoria:");
         System.out.println("1- Shows");
         System.out.println("2- Filmes");
         System.out.println("3- Softwares");
	}
}
