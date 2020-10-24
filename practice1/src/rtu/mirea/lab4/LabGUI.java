package rtu.mirea.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class LabGUI  extends JFrame {
    JPanel panel = new JPanel();
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    int mil = 0;
    int mad = 0;
    JLabel label1 = new JLabel("Result: " + mil +" X "+mad);
    JLabel label2 = new JLabel("Last Scorer: ");
    JLabel label3 = new JLabel("Winner: ");

    public LabGUI(int x, int y){
        super("Little Game");
        setSize(x,y);
        setVisible(true);
        add(panel);
        panel.setLayout(new GridLayout(3,3));
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                label1.setText("Result: "+mil+" X "+mad);
                label2.setText("Last Scorer: AC Milan");
                if(mil<mad)
                    label3.setText("Winner: Real Madrid");
                else if(mil>mad)
                    label3.setText("Winner: AC Milan");
                else label3.setText("Winner: ");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                label1.setText("Result: "+ mil+" X "+mad);
                label2.setText("Last Scorer: Real Madrid");
                if(mil<mad)
                    label3.setText("Winner: Real Madrid");
                else if(mil>mad)
                    label3.setText("Winner: AC Milan");
                else label3.setText("Winner: ");
            }
        });
    }
}
