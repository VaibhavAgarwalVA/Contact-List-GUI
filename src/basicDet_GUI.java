import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import javax.swing.JRadioButton;

public class basicDet_GUI {

	public JFrame frame;
	
	Run runobj= new Run();
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public basicDet_GUI(final int s) {
		initialize(s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int s) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateNewContact = new JLabel("Create New Contact");
		lblCreateNewContact.setBounds(140, 12, 155, 15);
		frame.getContentPane().add(lblCreateNewContact);
		
		JLabel lblBasicDetails = new JLabel("Basic Details");
		lblBasicDetails.setBounds(162, 54, 101, 15);
		frame.getContentPane().add(lblBasicDetails);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(88, 87, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(88, 114, 129, 15);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblEmailId = new JLabel("E-Mail ID");
		lblEmailId.setBounds(88, 141, 70, 15);
		frame.getContentPane().add(lblEmailId);
		
		textField = new JTextField();
		textField.setBounds(225, 85, 129, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 112, 129, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 139, 129, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("<--|");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(366, 226, 58, 25);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnPersonal = new JRadioButton("Personal", false);
		rdbtnPersonal.setBounds(49, 200, 149, 23);
		frame.getContentPane().add(rdbtnPersonal);
		rdbtnPersonal.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1){
					if(s==-1){
						Personal ob= new Personal();
						Run.per.addElement(ob);
						int n = Run.per.size();
						try{
							String st=textField.getText();
							Run.per.elementAt(n-1).set_name(st);
							st= textField_2.getText();
							Run.per.elementAt(n-1).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.per.elementAt(n-1).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createPer_GUI obj= new createPer_GUI(n-1);
						obj.frame.setVisible(true);
					}
					else{
						try{
							String st=textField.getText();
							Run.per.elementAt(s).set_name(st);
							st= textField_2.getText();
							Run.per.elementAt(s).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.per.elementAt(s).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createPer_GUI obj= new createPer_GUI(s);
						obj.frame.setVisible(true);
					}
				}
			}
		});
		
		JRadioButton rdbtnProfessional = new JRadioButton("Professional",false);
		rdbtnProfessional.setBounds(49, 227, 149, 23);
		frame.getContentPane().add(rdbtnProfessional);
		rdbtnProfessional.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1){
					if(s==-1){
						Professional ob= new Professional();
						Run.pro.addElement(ob);
						int n = Run.pro.size();
						try{
							String st=textField.getText();
							Run.pro.elementAt(n-1).set_name(st);
							st= textField_2.getText();
							Run.pro.elementAt(n-1).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.pro.elementAt(n-1).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createPro_GUI obj= new createPro_GUI(n-1);
						obj.frame.setVisible(true);
					}
					else{
						try{
							String st=textField.getText();
							Run.pro.elementAt(s).set_name(st);
							st= textField_2.getText();
							Run.pro.elementAt(s).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.pro.elementAt(s).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createPro_GUI obj= new createPro_GUI(s);
						obj.frame.setVisible(true);
					}
				}
			}
		});
		
		
		JRadioButton rdbtnRelatives = new JRadioButton("Relatives",false);
		rdbtnRelatives.setBounds(202, 200, 149, 23);
		frame.getContentPane().add(rdbtnRelatives);
		rdbtnRelatives.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1){
					if(s==-1){
						Relatives ob= new Relatives();
						Run.rel.addElement(ob);
						int n = Run.rel.size();
						try{
							String st=textField.getText();
							Run.rel.elementAt(n-1).set_name(st);
							st= textField_2.getText();
							Run.rel.elementAt(n-1).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.rel.elementAt(n-1).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createRel_GUI obj= new createRel_GUI(n-1);
						obj.frame.setVisible(true);
					}
					else{
						try{
							String st=textField.getText();
							Run.rel.elementAt(s).set_name(st);
							st= textField_2.getText();
							Run.rel.elementAt(s).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.rel.elementAt(s).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createRel_GUI obj= new createRel_GUI(s);
						obj.frame.setVisible(true);
					}
				}
			}
		});
		
		JRadioButton rdbtnCasual = new JRadioButton("Casual",false);
		rdbtnCasual.setBounds(202, 226, 149, 25);
		frame.getContentPane().add(rdbtnCasual);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(31, 177, 70, 15);
		frame.getContentPane().add(lblType);
		rdbtnCasual.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1){
					if(s==-1){
						Casual ob= new Casual();
						Run.cas.addElement(ob);
						int n = Run.cas.size();
						try{
							String st=textField.getText();
							Run.cas.elementAt(n-1).set_name(st);
							st= textField_2.getText();
							Run.cas.elementAt(n-1).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.cas.elementAt(n-1).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createCas_GUI obj= new createCas_GUI(n-1);
						obj.frame.setVisible(true);
					}
					else{
						try{
							String st=textField.getText();
							Run.cas.elementAt(s).set_name(st);
							st= textField_2.getText();
							Run.cas.elementAt(s).set_email(st);
							st= textField_1.getText();
							long num= Long.parseLong(st);
							Run.cas.elementAt(s).set_mobile(num);
						}
						catch(Exception ex){
							System.out.println("Incorrect format !");
						}
						frame.setVisible(false);
						
						createCas_GUI obj= new createCas_GUI(s);
						obj.frame.setVisible(true);
					}
				}
			}
		});
		
	}
}
