import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.*;
import java.util.*;

public class Run implements java.io.Serializable{
	
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
		try{
			FileInputStream fileIn = new FileInputStream("reldata.ser");
     	  	ObjectInputStream in = null; 
     	  	
  			File file = new File("reldata.ser");
  			boolean isEmpty = file.length()<10;
    	   	if(!isEmpty){
    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
    	   		rel = (Vector<Relatives>) in.readObject();
    	   	}
			if(in!=null){
				in.close();
			}
			fileIn.close();
		 
		 	fileIn = new FileInputStream("perdata.ser");
     	  	in = null; 
  			file = new File("perdata.ser");
  			isEmpty = file.length()<10;
    	   	if(!isEmpty){
    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
    	   		per = (Vector<Personal>) in.readObject();
    	   	}
			if(in!=null){
				in.close();
			}
			fileIn.close();
			
			fileIn = new FileInputStream("prodata.ser");
     	  	in = null; 
  			file = new File("prodata.ser");
  			isEmpty = file.length()<10;
    	   	if(!isEmpty){
    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
    	   		pro = (Vector<Professional>) in.readObject();
    	   	}
			if(in!=null){
				in.close();
			}
			fileIn.close();
			
			fileIn = new FileInputStream("casdata.ser");
     	  	in = null; 
  			file = new File("casdata.ser");
  			isEmpty = file.length()<10;
    	   	if(!isEmpty){
    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
    	   		cas = (Vector<Casual>) in.readObject();
    	   	}
			if(in!=null){
				in.close();
			}
			fileIn.close();
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Error in file handling RUN");
		}
		catch(ClassNotFoundException e){
			JOptionPane.showMessageDialog(null, "Error in file handling RUN 2");
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error in file handling RUN 3");
		}
		
		try {
			Welcome_GUI window = new Welcome_GUI();
			window.frame.setVisible(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}