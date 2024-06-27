package controller;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Writer {
    
    private String file = "";
    public Writer(){}

    public String getFile() {
        return file;
    }
    
    public void addFile(String file) {
        this.file += file;
    }
    
    public void write(){
        try   
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C.csv"));
            writer.write(file);
            writer.close();
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }  
    }
    
}
