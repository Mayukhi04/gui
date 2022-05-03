package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// demo gui
	System.out.println("SEQUENCE: Program started");

	JFrame frame = new JFrame("Demo Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GUI myGUI = new GUI(300, 150);
	frame.add(myGUI);
	frame.pack();
	frame.setVisible(true);
    }
}
