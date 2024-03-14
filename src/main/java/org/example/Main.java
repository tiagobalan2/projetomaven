package org.example;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

import static org.example.ServicoAnimal.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1, "Dono1", "Animal1", 5);
        Animal animal2 = new Animal(2, "Dono2", "Animal2", 3);
        Animal animal4 = new Animal(4, "Dono3", "Animal3", 8);
        Animal animal3 = new Animal(3, "Dono4", "Animal4", 13);

        cadastrarAnimal(animal1);
        cadastrarAnimal(animal2);
        cadastrarAnimal(animal3);
        cadastrarAnimal(animal4);

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Editar Animal");
            System.out.println("3. Excluir Animal");
            System.out.println("4. Consultar Animal");
            System.out.println("5. Listar Quantidade de Animais");
            System.out.println("6. Listar todos os animais cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarAnimal(animal1);
                    break;
                case 2:
                    editarAnimal(animal1, animal2);
                    break;
                case 3:
                    excluirAnimal(animal1.getIdAnimal());
                    break;
                case 4:
                    consultarAnimal(animal1.getIdAnimal());
                    break;
                case 5:
                    listarQuantidadeAnimais();
                    break;
                case 6:
                    retornarTodosAnimais();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }


    }
