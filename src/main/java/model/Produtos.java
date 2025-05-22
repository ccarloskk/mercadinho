package model;

public class Produtos {
    private int id_produto;
    private String nome_produto;
    private double valor_produto;
    private int quant_produto;

    public Produtos(int idProduto, String nome_produto, double valor_produto, int quant_produto){
        this.id_produto = idProduto;
        this.nome_produto = nome_produto;
        this.valor_produto = valor_produto;
        this.quant_produto = quant_produto;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor_produto() {  // Padronizado para português
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public int getQuant_produto() {
        return quant_produto;
    }

    public void setQuant_produto(int quant_produto) {
        this.quant_produto = quant_produto;
    }
}


