package controller;



import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    public Reader(){
        readA();
        readB();
    }
    public void readA(){
        String line = "";
        try {
            BufferedReader read = new BufferedReader(new FileReader("A.csv"));
            while ((line = read.readLine()) != null) {
                String[] array = line.split(";");
                for (String string : array) {
                    System.out.println(string);
                    
                }
            }
            read.close();
        } catch (Exception e) {
            // TODO: handle exception
        e.printStackTrace();  
        }
    }
    public void readB(){
        String line = "";
        try {
            BufferedReader read = new BufferedReader(new FileReader("B.csv"));
            while ((line = read.readLine()) != null) {
                String[] array = line.split(";");
                for (String string : array) {
                    System.out.println(string);
                }
            }
            read.close();
        } catch (Exception e) {
            // TODO: handle exception
        e.printStackTrace();  
        }
    }
}
