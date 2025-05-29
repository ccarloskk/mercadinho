package dao;

import model.Produtos;
import java.sql.*;

public class VendasBD {
    private final Connection connection;

    public VendasBD(Connection connection) {
        this.connection = connection;
    }

    public Produtos buscarProduto(int id) {
        String sql = "SELECT * FROM produtos WHERE id_produto = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

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