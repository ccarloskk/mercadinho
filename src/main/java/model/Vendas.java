package model;

import dao.VendasBD;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Vendas {
        private final List<Produtos> carrinho = new ArrayList<>();
        private final VendasBD vendasBD;

        public Vendas(Connection connection) {
                this.vendasBD = new VendasBD(connection);
        }

        public void adicionarAoCarrinho(int idProduto) {
                Produtos produto = vendasBD.buscarProduto(idProduto);

                if(produto != null && produto.getQuant_produto() > 0) {
                        carrinho.add(produto);
                        System.out.println("Produto adicionado ao carrinho");
                } else {
                        System.out.println("Produto indisponível");
                }
        }
}