package Bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Logica.Evento;



public class EventoDao {
	// a conexão com o banco de dados
	 private Connection connection;
	
	 public EventoDao() {
	 this.connection = new ConnectionFactory().getConnection();
	 }
	 
public void adiciona(Evento evento) {
 String sql = "insert into evento " +
 "(titulo, data, email, descricao)" +
 " values (?,?,?,?)";

 try {
 // prepared statement para inserção
	 PreparedStatement stmt = connection.prepareStatement(sql);

 // seta os valores
 stmt.setString(1,evento.getTitulo());
 stmt.setString(2,evento.getData());
 stmt.setString(3,evento.getEmail());
 stmt.setString(4,evento.getDescricao());
 

 // executa
 stmt.execute();
 stmt.close();
} catch (SQLException e) {
	throw new RuntimeException(e);
 }
}
}

