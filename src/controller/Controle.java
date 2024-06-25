package controller;

import java.util.ArrayList;
import models.*;

public class Controle {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    public Controle(){
        Pessoa pessoa = new Pessoa(1,"vitor","rua b","Curitiba");
        Writter writer = new Writter(pessoa);
    }
}
