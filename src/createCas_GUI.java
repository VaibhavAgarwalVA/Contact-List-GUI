import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createCas_GUI {

	public JFrame frame;

	Run runobj= new Run();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the application.
	 */
	public createCas_GUI(final int s) {
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
		
		JLabel lblCasualContact = new JLabel("Casual Contact");
		lblCasualContact.setBounds(156, 31, 122, 15);
		frame.getContentPane().add(lblCasualContact);
		
		JLabel lblWhenYouMet = new JLabel("WHEN you met");
		lblWhenYouMet.setBounds(32, 79, 112, 15);
		frame.getContentPane().add(lblWhenYouMet);
		
		textField = new JTextField();
		textField.setBounds(156, 77, 232, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHowYouMet = new JLabel("HOW you met");
		lblHowYouMet.setBounds(32, 110, 112, 15);
		frame.getContentPane().add(lblHowYouMet);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 108, 232, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblWhereYouMet = new JLabel("WHERE you met");
		lblWhereYouMet.setBounds(32, 137, 112, 15);
		frame.getContentPane().add(lblWhereYouMet);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 135, 232, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUsefulInfo = new JLabel("Useful Info");
		lblUsefulInfo.setBounds(32, 164, 112, 15);
		frame.getContentPane().add(lblUsefulInfo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 162, 232, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSaveReturn = new JButton("Save & Return");
		btnSaveReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st= textField.getText();
				Run.cas.elementAt(s).set_when(st);
				st= textField_1.getText();
				Run.cas.elementAt(s).set_how(st);
				st= textField_2.getText();
				Run.cas.elementAt(s).set_where(st);
				st= textField_3.getText();
				Run.cas.elementAt(s).set_info(st);
				frame.setVisible(false);
			}
		});
		btnSaveReturn.setBounds(139, 206, 150, 25);
		frame.getContentPane().add(btnSaveReturn);
	}
}
