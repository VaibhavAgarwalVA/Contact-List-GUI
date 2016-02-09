import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createRel_GUI {

	public JFrame frame;

	Run runobj= new Run();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public createRel_GUI(final int s) {
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
		
		JLabel lblRelativesContact = new JLabel("Relatives Contact");
		lblRelativesContact.setBounds(157, 27, 130, 15);
		frame.getContentPane().add(lblRelativesContact);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(49, 82, 113, 15);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblDateOfLast = new JLabel("Date of Last Meeting");
		lblDateOfLast.setBounds(49, 109, 178, 15);
		frame.getContentPane().add(lblDateOfLast);
		
		textField = new JTextField();
		textField.setBounds(224, 80, 152, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 107, 152, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSaveReturn = new JButton("Save & Return");
		btnSaveReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st= textField.getText();
				Run.rel.elementAt(s).set_dob(st);
				st= textField_1.getText();
				Run.rel.elementAt(s).set_last_meet(st);
				frame.setVisible(false);
			}
		});
		btnSaveReturn.setBounds(157, 163, 140, 25);
		frame.getContentPane().add(btnSaveReturn);
	}

}
