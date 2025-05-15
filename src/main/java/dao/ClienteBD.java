package dao;

import model.Cliente;
import model.Produtos;
import java.sql.*;

public class ClienteBD {
    public void CriarUsuario(Cliente clientes){
            String sql = "INSERT INTO clientes (cpf_cliente, nome_cliente) VALUES (?, ?)";

            try (Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setInt(1, clientes.getCpf_cliente());
                stmt.setString(1, clientes.getNome_cliente());

                stmt.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}