import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayPart_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public displayPart_GUI() {
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
		
		JLabel lblDeletionPortal = new JLabel("Display (Particular) Portal");
		lblDeletionPortal.setBounds(124, 30, 195, 15);
		frame.getContentPane().add(lblDeletionPortal);
		
		JButton btnPersonal = new JButton("Personal");
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dropdown_GUI obj= new dropdown_GUI(1,1);
				obj.frame.setVisible(true);
			}
		});
		btnPersonal.setBounds(157, 93, 129, 25);
		frame.getContentPane().add(btnPersonal);
		
		JButton btnProfessional = new JButton("Professional");
		btnProfessional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dropdown_GUI obj= new dropdown_GUI(1,2);
				obj.frame.setVisible(true);
			}
		});
		btnProfessional.setBounds(157, 123, 129, 25);
		frame.getContentPane().add(btnProfessional);
		
		JButton btnCasual = new JButton("Casual");
		btnCasual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dropdown_GUI obj= new dropdown_GUI(1,4);
				obj.frame.setVisible(true);
			}
		});
		btnCasual.setBounds(157, 151, 129, 25);
		frame.getContentPane().add(btnCasual);
		
		JButton btnRelatives = new JButton("Relatives");
		btnRelatives.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dropdown_GUI obj=new dropdown_GUI(1,3);
				obj.frame.setVisible(true);
			}
		});
		btnRelatives.setBounds(157, 178, 129, 25);
		frame.getContentPane().add(btnRelatives);
		
		JButton button = new JButton("<-- |");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		button.setBounds(193, 235, 62, 25);
		frame.getContentPane().add(button);
	}
}
