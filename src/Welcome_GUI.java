import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome_GUI {

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(162, 233, 106, 25);
		frame.getContentPane().add(btnExit);
	}
}
