
import dao.ConexaoBD;
import dao.ProdutoBD;
import model.Produtos;

import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        Produtos produtoTeste = new Produtos();
        produtoTeste.setId_produto(4);

        ProdutoBD produtoBD = new ProdutoBD();

        try {
            produtoBD.ExcluirProduto(produtoTeste);
            System.out.println("Produto excluido!");
        } catch (Exception e) {
            System.err.println("Erro ao excluir: " + e.getMessage());
            e.printStackTrace();
        }
    }
}