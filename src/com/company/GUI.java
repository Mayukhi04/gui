package com.company;
import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel{
    // canvas for other GUI widgets
    JButton button1;
    JButton button2;

    public GUI(int width, int height) {
        System.out.println("SEQUENCE: GUI Constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("B1");
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("B2");
        button2.setBounds(120,0, 100, 40);
        add(button1);
        add(button2);
    }

}
