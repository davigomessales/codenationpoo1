package br.com.codenation.aceleradev.rec.loja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
	public static boolean existeCpf(String cpf) {
		
		try {
			Connection conexao = ConnectionFactory.createConnection();
			String sql ="select cpf from usuario where cpf=?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			
			String nome = null;
			while(rs.next()) {
				nome = rs.getString(1);
			}
			
			if (nome == null) {
				return false;
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
