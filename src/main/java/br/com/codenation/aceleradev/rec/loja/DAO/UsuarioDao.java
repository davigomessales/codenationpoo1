package br.com.codenation.aceleradev.rec.loja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.exceptions.UsuarioInvalidoException;

public class UsuarioDao {
	public static String existeCpf(String cpf) throws UsuarioInvalidoException{
		String nome = null;
		try {
			Connection conexao = ConnectionFactory.createConnection();
			String sql ="select cpf from usuario where cpf=?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				nome = rs.getString(1);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nome;
	}
}
