package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoAnimal {

    static List<Animal> listaAnimal = new ArrayList<>();

    //validar animal
    public static int validarAnimalBase(Animal animal) {
        if (animal.getIdAnimal() == 0) {
            return 0;
        }
        if (animal.getNomeDono() == null || animal.getNomeDono().trim().isEmpty()) {
            return 0;
        }
        if (animal.getNomeAnimal() == null || animal.getNomeAnimal().trim().isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static void validarAnimal(Animal animal) {
        if (animal.getIdAnimal() == 0) {
            System.out.println("Animal incompleto");
        }
        if (animal.getNomeDono() == null || animal.getNomeDono().trim().isEmpty()) {
            System.out.println("Animal incompleto");
        }
        if (animal.getNomeAnimal() == null || animal.getNomeAnimal().trim().isEmpty()) {
            System.out.println("Animal incompleto");
        }
        System.out.println("Animal validado com sucesso");
    }

    //cadastro de animal
    public static void cadastrarAnimal(Animal animal) {
        try {
            for (Animal a : listaAnimal) {
                if (a.getIdAnimal() == animal.getIdAnimal()) {
                    System.out.println("Não é possível cadastrar o animal. O ID já está registrado.");
                    return; // Encerra o método caso o ID seja duplicado
                }
            }
            listaAnimal.add(animal);
            System.out.println("Animal cadastrado com sucesso");
        } catch (Exception e) {
            System.out.println("Nao foi possivel cadastrar o animal");
        }
    }

    //edicao de animal
    public static boolean editarAnimal(Animal animalExistente, Animal novasInformacoes) {
        try {
            if (validarAnimalBase(novasInformacoes) == 1) {
                // Itera sobre a lista de animais
                for (Animal a : listaAnimal) {
                    // Verifica se o animal atual é o mesmo que o animalExistente
                    if (a.equals(animalExistente)) {
                        // Atualiza as informações do animal com as novas informações
                        a.setNomeDono(novasInformacoes.getNomeDono());
                        a.setNomeAnimal(novasInformacoes.getNomeAnimal());
                        a.setIdadeAnimal(novasInformacoes.getIdadeAnimal());
                        System.out.println("Animal editado com sucesso");
                        return true;
                    }
                }
                System.out.println("Animal não encontrado na lista");
                return false;
            } else {
                System.out.println("Novas informações inválidas. Não foi possível editar o animal");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Não foi possível editar o animal");
            return false;
        }
    }




    //exclusao de animal
    public static void excluirAnimal(int idAnimal){
        for (int i = 0; i < listaAnimal.size(); i++) {
            if(listaAnimal.get(i).getIdAnimal() == idAnimal) {
                listaAnimal.remove(i);
                System.out.println("Animal excluido com sucesso");
                return;
            }
        }
        System.out.println("Nao foi possivel excluir o animal");
    }

    //consultar animal por id
    public static void consultarAnimal(int idAnimal) {
        try {
            Animal animal = null;

            for (Animal a: listaAnimal) {
                if(a.getIdAnimal() == idAnimal) {
                    animal = a;
                    break;
                }
            }
            System.out.println("Id do animal: " + animal.getIdAnimal() + ", Nome do dono: " + animal.getNomeDono() + ", Nome do animal: " + animal.getNomeAnimal() + ", Idade do animal: " + animal.getIdadeAnimal());
        } catch (Exception e) {
            System.out.println("Nao foi possivel consultar o animal");
        }

    }

    public static void listarQuantidadeAnimais() {
        System.out.println(listaAnimal.size());
    }

    public static List<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public static void setListaAnimal(List<Animal> listaAnimal) {

        ServicoAnimal.listaAnimal = listaAnimal;
    }

    public static void retornarTodosAnimais() {
        if (listaAnimal.isEmpty() || listaAnimal == null) {
            System.out.println("Nao ha animais cadastrados");
        } else {
            for (Animal a : listaAnimal)
                System.out.println("Id do animal: " + a.getIdAnimal()+ ", Nome do dono: " + a.getNomeDono() + ", Nome do animal: " + a.getNomeAnimal() + ", Idade do animal: " + a.getIdadeAnimal());
        }
    }


}
