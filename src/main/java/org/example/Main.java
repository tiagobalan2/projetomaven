package org.example;

import java.util.ServiceConfigurationError;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criação de alguns animais para teste
        Animal animal1 = new Animal(1, "Dono1", "Cachorro", 3);
        Animal animal2 = new Animal(2, "Dono2", "Gato", 5);
        Animal animal3 = new Animal(3, "Dono3", "Pássaro", 1);

        int validacaoanimal1 = ServicoAnimal.validarAnimal(animal1);
        System.out.println(validacaoanimal1);
        ServicoAnimal.cadastrarAnimal(animal1);
        ServicoAnimal.cadastrarAnimal(animal3);

        ServicoAnimal.editarAnimal(animal2);
        ServicoAnimal.excluirAnimal(3);
    }
}