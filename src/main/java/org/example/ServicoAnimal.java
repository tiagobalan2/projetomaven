package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoAnimal {

    static List<Animal> listaAnimal = new ArrayList<>();

     //validar animal
    public static int validarAnimal(Animal animal) {
        if(animal.getIdAnimal() == 0) {
            return 0;
        }
        if (animal.getNomeDono() == null || animal.getNomeDono().trim().isEmpty()) {
            return 0;
        }
        if(animal.getNomeAnimal() == null || animal.getNomeAnimal().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

    //cadastro de animal
    public static int cadastrarAnimal(Animal animal) {
        try {
            listaAnimal.add(animal);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    //edicao de animal
    public static boolean editarAnimal(Animal animal) {
        try {
            if (validarAnimal(animal) == 1) {
                //edicao animal
                for (Animal a : listaAnimal) {
                    if(a.getIdAnimal() == animal.getIdAnimal()) {
                        a.setNomeDono(animal.getNomeDono());
                        a.setNomeAnimal(animal.getNomeAnimal());
                        a.setIdadeAnimal(animal.getIdadeAnimal());
                        return true;
                    }
                }
                return false;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //exclusao de animal
    public static boolean excluirAnimal(int idAnimal){
        for (int i = 0; i < listaAnimal.size(); i++) {
            if(listaAnimal.get(i).getIdAnimal() == idAnimal) {
                listaAnimal.remove(i);
                return true;
            }
        }
        return false;
    }

    //consultar animal por id
    public static Animal consultarAnimal(int idAnimal) {
        Animal animal = null;
        for (Animal a: listaAnimal) {
            if(a.getIdAnimal() == idAnimal) {
                animal = a;
                break;
            }
        } return animal;
    }

    public static List<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public static void setListaAnimal(List<Animal> listaAnimal) {

        ServicoAnimal.listaAnimal = listaAnimal;
    }



}
