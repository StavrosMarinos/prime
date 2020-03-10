package basepack;

import javax.swing.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                var boxaki=new box("PrimeGenerator");
                boxaki.setVisible(true);
            }
        } );
    }

}

