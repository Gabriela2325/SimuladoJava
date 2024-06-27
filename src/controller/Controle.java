package controller;

import java.util.ArrayList;
import models.*;

public class Controle {
    Writer write = new Writer();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    public Controle(){}

    public void addPessoa(int id, String nome){
        Pessoa pessoa = new Pessoa(id, nome);
        pessoas.add(pessoa);
    }

    public void addRuaCidade(int id, String rua, String cidade){
        pessoas.get(id).setRua(rua);
        pessoas.get(id).setCidade(cidade);
        System.out.println(pessoas.get(id).toCSV()+"\n\n------------------------\n\n");
        write.addFile(pessoas.get(id).toCSV());
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public Writer getWrite() {
        return write;
    }

    public void setWrite(Writer write) {
        this.write = write;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
