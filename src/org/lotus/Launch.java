package org.lotus;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				String[] menu = {"-- Select --", "Chicken 65", "Tandori Chicken", "Chicken Crisspy"};
				JComboBox cb = new JComboBox(menu);
				JFrame f = new JFrame("Swing JFrame"); //title
				f.getContentPane().add(cb); //add combo box
				f.pack(); // auto size
				f.setLocationRelativeTo(null); //location on screen
				f.setVisible(true); // show
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how to close
			}
		};

		// create thread for this work(optional but recommended)
		SwingUtilities.invokeLater(work);
    }
}
