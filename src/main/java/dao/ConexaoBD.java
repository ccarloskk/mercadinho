package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConexaoBD {
    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(".properties"));
        } catch (IOException e) {
            throw new SQLException("Erro ao carregar o arquivo de configuração", e);
        }
        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}
