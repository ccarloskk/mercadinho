package dao;

import model.Produtos;
import model.Vendas;
import java.sql.*;

public class VendasBD {
    public void vendas_produtos(Vendas vendas){
        String sql = "INSERT INTO compras (nome_produto, valor_produto, quant_produto, valor_compra) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, vendas.getNome_produto());
            stmt.setDouble(2, vendas.getValor_compra());
            stmt.setInt(3, vendas.getQuant_produto());
            stmt.setDouble(4, vendas.getValor_produto());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
