import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.*;
import java.util.*;

public class Run {
	
	public static Vector<Relatives> rel= new Vector<Relatives>();
	public static Vector<Personal> per= new Vector<Personal>();
	public static Vector<Professional> pro= new Vector<Professional>();
	public static Vector<Casual> cas= new Vector<Casual>();
	
	Run() {
		;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Welcome_GUI window = new Welcome_GUI();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}