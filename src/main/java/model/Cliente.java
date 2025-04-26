package model;

public class Cliente {
    private String name_client;
    private int cpf_client;

    private void Cliente (String name_client,int cpf_client){
        this.name_client = name_client;
        this.cpf_client = cpf_client;
    }

    public String getName_client () {
        return name_client;
    }

    public void setName_client (String name_client){
        this.name_client = name_client;
    }

    public int getCpf_client () {
        return cpf_client;
    }

    public void setCpf_client ( int cpf_client){
        this.cpf_client = cpf_client;
    }
}