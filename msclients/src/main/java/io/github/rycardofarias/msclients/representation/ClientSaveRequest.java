package io.github.rycardofarias.msclients.representation;

import io.github.rycardofarias.msclients.entities.Client;

public class ClientSaveRequest {

    private String cpf;
    private String nome;
    private Integer idade;

    public Client toModel(){
        return new Client(cpf, nome, idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
