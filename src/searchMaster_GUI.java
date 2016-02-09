import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JCheckBox;

public class searchMaster_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public searchMaster_GUI() {
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
		
		JLabel lblSearchOptions = new JLabel("Search Options: ");
		lblSearchOptions.setBounds(154, 52, 153, 15);
		frame.getContentPane().add(lblSearchOptions);
		
		JCheckBox chckbxSearchByPhone = new JCheckBox("Search by phone number");
		chckbxSearchByPhone.setBounds(112, 96, 232, 23);
		chckbxSearchByPhone.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) { 
				if(e.getStateChange()==1){
					frame.setVisible(false);
					
					searchNum_GUI obj=new searchNum_GUI();
					obj.frame.setVisible(true);
				}
			}
		});
		frame.getContentPane().add(chckbxSearchByPhone);
		
		JCheckBox chckbxSearchByAny = new JCheckBox("Search by any other field");
		chckbxSearchByAny.setBounds(112, 123, 232, 23);
		chckbxSearchByAny.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) { 
				if(e.getStateChange()==1){
					frame.setVisible(false);
					
					search_GUI obj=new search_GUI();
					obj.frame.setVisible(true);
				}
			}
		});
		frame.getContentPane().add(chckbxSearchByAny);
		
		JLabel lblcheckAnyOne = new JLabel("(Check any one)");
		lblcheckAnyOne.setBounds(154, 167, 129, 15);
		frame.getContentPane().add(lblcheckAnyOne);
	}
}
