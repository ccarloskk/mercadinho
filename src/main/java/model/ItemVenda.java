package model;

public class ItemVenda {
    private Produtos produto;
    private int quantidade_vendida;

    public ItemVenda(Produtos produto, int quantidade_vendida){
        this.produto = produto;
        this.quantidade_vendida = quantidade_vendida;
    }

    public Produtos getProduto() {
        return produto;
    }
}