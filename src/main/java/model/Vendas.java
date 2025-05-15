package model;

public class Vendas{
    private String nome_produto;
    private double valor_produto;
    private int quant_produto;
    private double valor_compra;

    public void Vendas (String nome_produto, double valor_produto, int quant_produto, double valor_compra){
        this.nome_produto = nome_produto;
        this.valor_produto = valor_produto;
        this.quant_produto = quant_produto;
        this.valor_compra = valor_compra;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor_produto() {
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

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
}
