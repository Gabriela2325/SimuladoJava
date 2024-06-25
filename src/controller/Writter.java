package controller;



import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import models.Pessoa;

public class Writter {
    
    private File file;
    public Writter(Pessoa pessoa){
        try   
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C.csv"));
            writer.write(pessoa.toCSV());
            writer.write("\n"+pessoa.toCSV());
            writer.close();
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }  
    }
    
}
