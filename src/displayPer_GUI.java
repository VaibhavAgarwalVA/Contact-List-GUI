import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class displayPer_GUI {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public displayPer_GUI(final int s) {
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
		lblPersonalContact.setBounds(147, 30, 148, 15);
		frame.getContentPane().add(lblPersonalContact);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(89, 70, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(89, 97, 125, 15);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(89, 124, 70, 15);
		frame.getContentPane().add(lblEmailId);
		
		JLabel lblContext = new JLabel("Context");
		lblContext.setBounds(89, 151, 70, 15);
		frame.getContentPane().add(lblContext);
		
		JLabel lblDateOfMeeting = new JLabel("Date of meeting");
		lblDateOfMeeting.setBounds(89, 178, 125, 15);
		frame.getContentPane().add(lblDateOfMeeting);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setBounds(89, 205, 70, 15);
		frame.getContentPane().add(lblEvents);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(233, 70, 148, 15);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(Run.per.elementAt(s).get_name());
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(233, 97, 151, 15);
		frame.getContentPane().add(lblNewLabel_1);
		String mobile = "+91 "+ Run.per.elementAt(s).get_mobile();
		lblNewLabel_1.setText(mobile);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(233, 124, 136, 15);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setText(Run.per.elementAt(s).get_email());
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(233, 151, 148, 15);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setText(Run.per.elementAt(s).get_context());
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(233, 178, 136, 15);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setText(Run.per.elementAt(s).get_date());
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(233, 205, 148, 15);
		frame.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setText(Run.per.elementAt(s).get_events());
		
		JSeparator separator = new JSeparator();
		separator.setBounds(220, 57, 0, 163);
		frame.getContentPane().add(separator);
	}
}
