package br.com.codenation.aceleradev.rec.loja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.Entities.Usuario;
import br.com.codenation.aceleradev.rec.loja.exceptions.UsuarioInvalidoException;

public class UsuarioDao {
	public static Usuario existeCpf(String cpf) throws UsuarioInvalidoException{
		Usuario usuario = null;
		try {
			Connection conexao = ConnectionFactory.createConnection();
			String sql ="select * from usuario where cpf= ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setNome(rs.getString("nome"));
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
}
