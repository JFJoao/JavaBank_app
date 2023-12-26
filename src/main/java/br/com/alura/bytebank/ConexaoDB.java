package br.com.alura.bytebank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/boc_app?user=root&password=<insert password>");
            System.out.println("Conectado ao banco de dados.");

            connection.close();

        } catch (SQLException e) {
            // Mensagem geral em caso de erro.
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
