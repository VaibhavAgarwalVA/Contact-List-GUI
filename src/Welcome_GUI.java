import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;

public class Welcome_GUI implements java.io.Serializable{

	public JFrame frame;

	Run runobj= new Run();
	/**
	 * Create the application.
	 */
	public Welcome_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblContactList = new JLabel("Contact List");
		lblContactList.setBounds(172, 12, 96, 15);
		frame.getContentPane().add(lblContactList);
		
		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				basicDet_GUI obj= new basicDet_GUI(-1);
				obj.frame.setVisible(true);
			}
		});
		btnCreateNew.setBounds(125, 71, 184, 25);
		frame.getContentPane().add(btnCreateNew);
		
		JButton btnDisplayAll = new JButton("Display ALL");
		btnDisplayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayAll_GUI obj= new displayAll_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnDisplayAll.setBounds(125, 127, 184, 25);
		frame.getContentPane().add(btnDisplayAll);
		
		JButton btnDelete = new JButton("Delete ");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete_GUI obj=new delete_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnDelete.setBounds(125, 99, 184, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchMaster_GUI obj= new searchMaster_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnSearch.setBounds(125, 179, 184, 25);
		frame.getContentPane().add(btnSearch);
		
		JButton btnDisplayParticular = new JButton("Display Particular");
		btnDisplayParticular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayPart_GUI obj= new displayPart_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnDisplayParticular.setBounds(125, 153, 184, 25);
		frame.getContentPane().add(btnDisplayParticular);
		
		JButton btnExit = new JButton("EXIT !");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					FileOutputStream fileOut = new FileOutputStream("prodata.ser");
					ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
					out.writeObject(Run.pro);
					out.close();
					fileOut.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				try{	
					FileOutputStream fileOut = new FileOutputStream("casdata.ser");
					ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
					out.writeObject(Run.cas);
					out.close();
					fileOut.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				try{	
					FileOutputStream fileOut = new FileOutputStream("perdata.ser");
					ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
					out.writeObject(Run.per);
					out.close();
					fileOut.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				try{	
					FileOutputStream fileOut = new FileOutputStream("reldata.ser");
					ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
					out.writeObject(Run.rel);
					out.close();
					fileOut.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					FileInputStream fileIn = new FileInputStream("reldata.ser");
		     	  	ObjectInputStream in = null; 
		  			File file = new File("reldata.ser");
		  			boolean isEmpty = file.length()<10;
		    	   	if(!isEmpty){
		    	  		in = new ObjectInputStream(new BufferedInputStream(fileIn));
		    	   		Run.rel = (Vector<Relatives>) in.readObject();
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
		    	   		Run.per = (Vector<Personal>) in.readObject();
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
		    	   		Run.pro = (Vector<Professional>) in.readObject();
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
		    	   		Run.cas = (Vector<Casual>) in.readObject();
		    	   	}
					if(in!=null){
						in.close();
					}
					fileIn.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error in file handling");
				}
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(162, 233, 106, 25);
		frame.getContentPane().add(btnExit);
	}
}
