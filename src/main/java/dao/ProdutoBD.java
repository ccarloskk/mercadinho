package dao;

import model.Produtos;
import java.sql.*;

public class ProdutoBD {
    public void CriarProduto(Produtos produtos) {
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
    public boolean ExcluirProduto(Produtos produtos){
        String sql = "DELETE FROM produtos WHERE id_produto = ?";

        try(Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,produtos.getId_produto());

            System.out.println("Produto excluido ");
            int linhasafetadas = stmt.executeUpdate();

            return linhasafetadas >= 1;

        } catch (SQLException e) {
            System.err.println("Erro ao excluir o produto: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
