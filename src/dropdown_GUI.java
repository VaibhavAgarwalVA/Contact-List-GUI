import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class dropdown_GUI {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	//use, delete-0, display-1
	//type, per-1, pro-2, rel-3, cas-4
	public dropdown_GUI(final int use, final int type) {
		initialize(use,type);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int use, final int type) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChoose = new JLabel("Choose");
		lblChoose.setBounds(183, 45, 70, 15);
		frame.getContentPane().add(lblChoose);
		int s;
		String[] messages;
		switch(type){
			case 1: s= Run.per.size();
				messages = new String[s];
				for(int i=0;i<s;i++){
					messages[i]= Run.per.elementAt(i).get_name();
					System.out.println("message= "+ Run.per.elementAt(i).get_name());
				}
				break;
			case 2: s= Run.pro.size();
				messages = new String[s];
				for(int i=0;i<s;i++){
					messages[i]= Run.pro.elementAt(i).get_name();
					System.out.println("message= "+ Run.pro.elementAt(i).get_name());
				}
				break;		
			case 3: s= Run.rel.size();
				messages = new String[s];
				for(int i=0;i<s;i++){
					messages[i]= Run.rel.elementAt(i).get_name();
					System.out.println("message= "+ Run.rel.elementAt(i).get_name());
				}
				break;			   
			case 4: s= Run.cas.size();
				messages = new String[s];
				for(int i=0;i<s;i++){
					messages[i]= Run.cas.elementAt(i).get_name();
					System.out.println("message= "+ Run.cas.elementAt(i).get_name());
				}
				break;
			default: messages = new String[0]; 
				System.out.println("Should not be here");		
		
		}
		JComboBox comboBox = new JComboBox(messages);
		comboBox.setBounds(148, 101, 132, 24);
		frame.getContentPane().add(comboBox);
		
		final JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(183, 192, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ind = ((JComboBox)e.getSource()).getSelectedIndex();
				if(use == 0){
					switch(type){
						case 1: Run.per.remove(ind);
								break;
						case 2: Run.pro.remove(ind);
								break;
						case 3: Run.rel.remove(ind);
								break;
						case 4: Run.cas.remove(ind);
								break;
						default: System.out.println("Should not be here. ");		
					}
					lblNewLabel.setText("Deleted");
					frame.setVisible(false);
				}
				else if(use == 1){
					switch(type){
						case 1: displayPer_GUI obj= new displayPer_GUI(ind);
								obj.frame.setVisible(true);
							break;
						case 2: displayPro_GUI ob1= new displayPro_GUI(ind);
								ob1.frame.setVisible(true);
							break;
						case 3: displayRel_GUI ob3= new displayRel_GUI(ind);
								ob3.frame.setVisible(true);;
							break;
						case 4: displayCas_GUI ob2= new displayCas_GUI(ind);
								ob2.frame.setVisible(true);
							break;
						default: System.out.println("Should not be here. ");		
					}
					frame.setVisible(false);
				}
				else{
					System.out.println("Shouldn't be here !");
				}
				frame.setVisible(false);
			}
		});
	}
}
