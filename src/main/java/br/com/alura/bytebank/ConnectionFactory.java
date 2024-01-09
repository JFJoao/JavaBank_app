package br.com.alura.bytebank;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public  Connection recuperarConexao() {
        try {
           // metodo sem pool
           // return DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
           //         "boc_app?user=root&password=<insert password>");

            // metodo com pool
            return createDataSource().getConnection();


        } catch (SQLException e) {
            // Mensagem em caso de erro.
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
    private HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/boc_app");
        config.setUsername("root");
        config.setPassword("963963aa");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
