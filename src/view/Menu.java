package view;

import controller.Reader;

public class Menu {
    private Reader reader = new Reader();
    public void run(){
        reader.readA();
        reader.readB();
    }
}
