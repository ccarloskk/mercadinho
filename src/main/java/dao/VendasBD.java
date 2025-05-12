package dao;

import model.Produtos;
import java.sql.*;

public class VendasBD {
    private DatabaseMetaData ConnectionFactory;

    public void vendas_produtos(Produtos produto) throws SQLException {

        String sql = "INSERT INTO produto (id_compra, nome_produto, valor_produto, quant_produto, total_compra) VALUES (?, ?, ?, ?, ?)";

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt.setInt(1,produto.getId_produto());
            stmt.setString(2,produto.getNome_produto());
            stmt.setDouble(3, produto.getValor_produto());
            stmt.setInt(4, produto.getQuant_produto());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (stmt !=  null){
                    stmt.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
