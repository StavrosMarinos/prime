package basepack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class box extends JFrame{
    private JTextField textField1;
    private JButton getOneButton;
    private JPanel rootp;
    private JButton getAllButton;

    public box(String title){
        add(rootp);
        setTitle(title);
        setSize(275,140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getOneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index=Integer.parseInt(textField1.getText());
                int prime=Prime.getPrimeNumberAt(index);
                JOptionPane.showMessageDialog(rootp,prime);
            }
        });

        getAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index=Integer.parseInt(textField1.getText());
                LinkedList<Integer> primes=Prime
                        .getPrimeNumbers(index);
                String primesString=primes.toString();
                JOptionPane.showMessageDialog(rootp,primesString);
            }
        });
    }
}
