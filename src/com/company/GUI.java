package com.company;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener, DocumentListener {
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
        JTextField username = new JTextField();
        username.setBounds(0,60, 200, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        username.getDocument().addDocumentListener(this);
        add(button1);
        add(button2);
        add(username);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "B1") {
            System.out.println("1st button");
        } else {
            System.out.println("click! " + e.getActionCommand());
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        System.out.println("insert");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("removed");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("changed");
    }
}
