package com.company;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener, DocumentListener{
    // canvas for other GUI widgets
    JButton button1;
    JButton button2;

    public GUI(int width, int height) {
        System.out.println("SEQUENCE: GUI Constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        JLabel heading = new JLabel("Demo GUI");
        heading.setBounds(0,0, 200, 40);
        add(heading);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(290,0, 10, 150);
        add(scrollBar);

        button1 = new JButton("B1");
        button1.setBounds(0,40, 100, 40);
        button2 = new JButton("B2");
        button2.setBounds(120,40, 100, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(button1);
        add(button2);

        JMenu menu, subMenu;
        JMenuBar menuBar = new JMenuBar();
        menu=new JMenu("Menu");
        subMenu=new JMenu("Sub Menu");
        JMenuItem i1, i2, i3, i4, i5;
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu.setBounds(210,100, 50, 40);
        menu.add(i1); menu.add(i2); menu.add(i3);
        subMenu.add(i4); subMenu.add(i5);
        menu.add(subMenu);
        menuBar.add(menu);
        add(menuBar);
        add(menu);

        JTextField username = new JTextField();
        username.setBounds(0,100, 200, 40);
        username.getDocument().addDocumentListener(this);
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

package com.company;
import javax.swing.*;

class MenuExample
{
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    MenuExample(){
        JFrame f= new JFrame("Menu and MenuItem Example");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");
        i4=new JMenuItem("Item 4");
        i5=new JMenuItem("Item 5");
        menu.add(i1); menu.add(i2); menu.add(i3);
        submenu.add(i4); submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new MenuExample();
    }}
