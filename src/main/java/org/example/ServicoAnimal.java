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
        if(animal.getNomeAnimal() == null || animal.getNomeAnimal().trim().isEmpty(){
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

        }
    }
}
