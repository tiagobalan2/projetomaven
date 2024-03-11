package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {

    static List<Pessoa> listaPessoa = new ArrayList<>();

    //VALIDAR PESSOA
    public static int validarPessoa(Pessoa pessoa){
        if(pessoa.getIdPessoa() == 0){
            return 0;
        }
        if(pessoa.getNome() == null || pessoa.getNome().trim().isEmpty()){
            return 0;
        }
        if(pessoa.getCpf() == null || pessoa.getCpf().trim().isEmpty()){
            return 0;
        }
        return 1;
    }

    //CADASTRO DE PESSOA
    public static int cadastrarPessoa(Pessoa pessoa){
        try{
            listaPessoa.add(pessoa);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    //EDIÇÃO DE PESSOA
    public static boolean editarPessoa(Pessoa pessoa){
        try{
            if(validarPessoa(pessoa) == 1){
                //EDIÇÃO PESSOA
                for(Pessoa p : listaPessoa){
                    if(p.getIdPessoa() == pessoa.getIdPessoa()){
                        p.setNome(pessoa.getNome());
                        p.setCpf(pessoa.getCpf());
                        p.setIdade(pessoa.getIdade());
                        p.setSexo(pessoa.getSexo());
                        return true;
                    }
                }
                return false;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    //EXCLUSÃO DE PESSOA
    public static boolean excluirPessoa(int idPessoa){
        for(int i = 0; i < listaPessoa.size(); i ++){
            if(listaPessoa.get(i).getIdPessoa() == idPessoa){
                listaPessoa.remove(i);
                return true;
            }
        }
        return false;
    }

    //CONSULTAR PESSOA
    public static Pessoa consultarPessoa(int idPessoa){
        Pessoa pessoa = null;
        for(Pessoa p : listaPessoa){
            if(p.getIdPessoa() == idPessoa){
                pessoa = p;
                break;
            }
        }
        return pessoa;
    }

    public static List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public static void setListaPessoa(List<Pessoa> listaPessoa) {
        ServicoPessoa.listaPessoa = listaPessoa;
    }
}
