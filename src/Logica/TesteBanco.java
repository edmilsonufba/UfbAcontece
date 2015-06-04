package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Bd.ConnectionFactory;

public class TesteBanco {

    public static void main(String[] args) throws SQLException {

        // conectando
        Connection con = new ConnectionFactory().getConnection();

        // cria um preparedStatement
        String sql = "insert into evento " +
                " (titulo,data,email,descricao)" +
                " values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);

        // preenche os valores
        stmt.setString(1, "ujgiu");
        stmt.setString(2, "43/34/4566");
        stmt.setString(3, "contato@caelum.com.brfarma@ufba.br");
        stmt.setString(4, "ygwuyegtruyet iyergtoiweygr iyigi ugo");
        

        // executa
        stmt.execute();
        stmt.close();

        System.out.println("Gravado!");

        con.close();
    }
}

