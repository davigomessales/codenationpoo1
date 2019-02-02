package br.com.codenation.aceleradev.rec.loja.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://db4free.net:3306/adminproj";
        String user = "adminproj";
        String password = "FSFU06hq";
         
        Connection conexao = null;
        conexao = DriverManager.getConnection(url, user, password);
         
        return conexao;
    }
}