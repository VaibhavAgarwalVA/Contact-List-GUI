import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class createPro_GUI {

	public JFrame frame;
	private JTextArea textArea;
	
	Run runobj= new Run();

	/**
	 * Create the application.
	 */
	public createPro_GUI(final int s) {
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

		
		JLabel lblProfessionalContacts = new JLabel("Professional Contacts");
		lblProfessionalContacts.setBounds(135, 29, 192, 15);
		frame.getContentPane().add(lblProfessionalContacts);
		
		JLabel lblInterests = new JLabel("Interests");
		lblInterests.setBounds(67, 105, 70, 15);
		frame.getContentPane().add(lblInterests);
		
		textArea = new JTextArea();
		textArea.setBounds(155, 94, 220, 84);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		frame.getContentPane().add(textArea);
		
		JButton btnSaveReturn = new JButton("Save & Return");
		btnSaveReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st= textArea.getText();
				Run.pro.elementAt(s).set_interests(st);
				frame.setVisible(false);
			}
		});
		btnSaveReturn.setBounds(155, 201, 137, 25);
		frame.getContentPane().add(btnSaveReturn);
	}
}
