import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JTextField;

public class searchNum_GUI {

	public JFrame frame;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public searchNum_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearchByNumber = new JLabel("Search by number");
		lblSearchByNumber.setBounds(136, 12, 154, 15);
		frame.getContentPane().add(lblSearchByNumber);
		
		textField = new JTextField();
		textField.setBounds(112, 220, 180, 19);
		textField.setEditable(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnButton = new JButton("1");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnButton.setBounds(70, 76, 70, 25);
		frame.getContentPane().add(btnButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		button.setBounds(165, 76, 70, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_1.setBounds(255, 76, 70, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_2.setBounds(70, 113, 70, 25);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_3.setBounds(165, 113, 70, 25);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_4.setBounds(255, 113, 70, 25);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_5.setBounds(70, 150, 70, 25);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_6.setBounds(165, 150, 70, 25);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_7.setBounds(255, 150, 70, 25);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_8.setBounds(165, 183, 70, 25);
		frame.getContentPane().add(button_8);
		
		JButton btnGo = new JButton("GO !");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText() + " ";
				int n= Run.rel.size();
				int flag=0;
				for(int i=0;i<n;i++){
					String num= Run.rel.elementAt(i).get_mobile() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayRel_GUI obj= new displayRel_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				n= Run.pro.size();
				for(int i=0;i<n;i++){
					String num= Run.pro.elementAt(i).get_mobile() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPro_GUI obj= new displayPro_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				n= Run.per.size();
				for(int i=0;i<n;i++){
					String num= Run.per.elementAt(i).get_mobile() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				n= Run.cas.size();
				for(int i=0;i<n;i++){
					String num= Run.cas.elementAt(i).get_mobile() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				if(flag == 0){
					JOptionPane.showMessageDialog(null, "Not found !!");
				}
				frame.setVisible(false);
			}
		});
		btnGo.setForeground(Color.WHITE);
		btnGo.setBackground(Color.RED);
		btnGo.setBounds(345, 220, 77, 25);
		frame.getContentPane().add(btnGo);
	}

}
