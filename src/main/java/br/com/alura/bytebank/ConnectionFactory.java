package br.com.alura.bytebank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public  Connection recuperarConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                    "boc_app?user=root&password=<insert password>");


        } catch (SQLException e) {
            // Mensagem em caso de erro.
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
