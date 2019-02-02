package br.com.codenation.aceleradev.rec.loja.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioDao {
	public static boolean cpfExiste(String cpf) {
		
		try {
			Connection conexao = ConnectionFactory.createConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
