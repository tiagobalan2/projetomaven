package org.example;

public class Animal {
    private int idAnimal;
    private String nomeDono;
    private String nomeAnimal;
    private int idadeAnimal;

    public Animal() {
    }

    public Animal(int idAnimal, String nomeDono, String nomeAnimal, int idadeAnimal) {
        this.idAnimal = idAnimal;
        this.nomeDono = nomeDono;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
}