package model;

public class Cliente {
    private String nome_cliente;
    private int cpf_cliente;

    private void Cliente (String name_client,int cpf_client){
        this.nome_cliente = nome_cliente;
        this.cpf_cliente = cpf_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public int getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(int cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
}