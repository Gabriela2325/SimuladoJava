package controller;



import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    Controle controle = new Controle();
    
    public Reader(){}

    public void readA(){
        String line = "";
        String message = "";
        try {
            BufferedReader read = new BufferedReader(new FileReader("A.csv"));
            while ((line = read.readLine()) != null) {
                message += "reading A line\n";
                String[] array = line.split(";");
                int id;
                id = Integer.parseInt(array[0]);
                String nome = array[1];
                controle.addPessoa(id, nome);
                message += id + ";" + nome +"\n";
                controle.addPessoa(id, nome);
            }
            System.out.println(message);
            read.close();
        } catch (IOException e) {
            // TODO: handle exception
        e.printStackTrace();  
        }
    }

    public void readB(){
        String line = "";
        String message = "";
        try {
            BufferedReader read = new BufferedReader(new FileReader("B.csv"));
            while ((line = read.readLine()) != null) {
                message += "reading B line\n";
                String[] array = line.split(";");
                int id;
                id = Integer.parseInt(array[0]);
                String rua = array[1];
                String cidade = array[2];
                message += id+";"+rua+";"+cidade+"\n";
                controle.addRuaCidade(id-1, rua, cidade);
            }
            System.out.println(message);
            controle.getWrite().write();
            read.close();
        } catch (IOException e) {
            // TODO: handle exception
        e.printStackTrace();  
        }
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    

}
