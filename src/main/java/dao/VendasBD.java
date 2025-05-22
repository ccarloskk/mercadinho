package dao;

import model.Produtos;
import java.sql.*;

public class VendasBD {
    public static Produtos BuscarProduto(int produtoid){
        String sql = "SELECT p.* FROM produtos p JOIN carrinho c ON p.id = c.produto_id WHERE c.id = ?";

        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, produtoid);
            ResultSet rs = stmt.executeQuery();

            stmt.executeUpdate();

            if (rs.next()) {
                 return new Produtos(
                        rs.getInt("id_produto"),
                        rs.getString("nome_produto"),
                        rs.getDouble("valor_produto"),
                        rs.getInt("quant_produto")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}