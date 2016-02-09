import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createPer_GUI {

	public JFrame frame;

	Run runobj= new Run();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public createPer_GUI(final int s) {
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
		
		JLabel lblPersonalContact = new JLabel("Personal Contact");
		lblPersonalContact.setBounds(158, 29, 122, 15);
		frame.getContentPane().add(lblPersonalContact);
		
		JLabel lblContextOfMeeting = new JLabel("Context of meeting");
		lblContextOfMeeting.setBounds(56, 78, 141, 15);
		frame.getContentPane().add(lblContextOfMeeting);
		
		JLabel lblMemorableEvent = new JLabel("Memorable Event");
		lblMemorableEvent.setBounds(56, 107, 141, 15);
		frame.getContentPane().add(lblMemorableEvent);
		
		JLabel lblDateOfAcquaintance = new JLabel("Date of Acquaintance");
		lblDateOfAcquaintance.setBounds(56, 136, 152, 15);
		frame.getContentPane().add(lblDateOfAcquaintance);
		
		textField = new JTextField();
		textField.setBounds(224, 76, 171, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 105, 171, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 134, 171, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSaveReturn = new JButton("Save & Return");
		btnSaveReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st = textField.getText();
				Run.per.elementAt(s).set_context(st);
				st = textField_1.getText();
				Run.per.elementAt(s).set_events(st);
				st= textField_2.getText();
				Run.per.elementAt(s).set_date(st);
				frame.setVisible(false);
			}
		});
		btnSaveReturn.setBounds(150, 175, 152, 25);
		frame.getContentPane().add(btnSaveReturn);
	}

}
