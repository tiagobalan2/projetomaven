package org.example;

public class Pessoa {

    //OBRIGATÓRIO
    private int idPessoa;
    //OBRIGATÓRIO
    private String nome;
    //OBRIGATÓRIO
    private String cpf;
    private Integer idade;
    private Character sexo;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String cpf, Integer idade, Character sexo) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
}
