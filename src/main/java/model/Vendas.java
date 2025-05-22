package model;

import dao.VendasBD;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private List<ItemCarrinho> itensCarrinho = new ArrayList<>();

    private static class ItemCarrinho {
        private Produtos produto;
        private int quantidade;

        public ItemCarrinho(Produtos produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produtos getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }
}