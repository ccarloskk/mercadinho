
import dao.ConexaoBD;
import dao.ProdutoBD;
import model.Produtos;

import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        Produtos produtoTeste = new Produtos();
        produtoTeste.setNome_produto("Arroz branco");
        produtoTeste.setQuant_produto(40);
        produtoTeste.setValor_produto(20);
        produtoTeste.setId_produto(5);

        ProdutoBD produtoBD = new ProdutoBD();

        try {
            produtoBD.AlterarDadosProduto(produtoTeste);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}