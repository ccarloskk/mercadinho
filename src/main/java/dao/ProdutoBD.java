package dao;

import model.Produtos;
import java.sql.*;

public class ProdutoBD {
    public void criar_produto(Produtos produtos) {

        String sql = "INSERT INTO produtos (nome_produto, valor_produto, quant_produto) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produtos.getNome_produto());
            stmt.setDouble(2, produtos.getValor_produto());
            stmt.setInt(3, produtos.getQuant_produto());

            stmt.executeUpdate();

        } catch (SQLException e) {

            System.err.println("Erro ao criar produto: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
