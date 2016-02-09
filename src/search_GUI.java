import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search_GUI {

	public JFrame frame;
	private JEditorPane editorPane;
	private JProgressBar progressBar;
	
	/**
	 * Create the application.
	 */
	public search_GUI() {
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
		
		progressBar = new JProgressBar();
		progressBar.setBounds(153, 211, 148, 14);
		frame.getContentPane().add(progressBar);
		
		JLabel lblSearchPanel = new JLabel("Search Panel");
		lblSearchPanel.setBounds(176, 26, 117, 15);
		frame.getContentPane().add(lblSearchPanel);
		
		editorPane = new JEditorPane();
		editorPane.setBounds(117, 85, 209, 21);
		frame.getContentPane().add(editorPane);
		
		JLabel lblProgress = new JLabel("Progress...");
		lblProgress.setBounds(183, 183, 92, 15);
		frame.getContentPane().add(lblProgress);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = editorPane.getText() + " ";
				
				for(int i=0;i<100000000;i++){
					progressBar.setValue(i);
				}
				
				int n= Run.rel.size();
				int flag=0;
				for(int i=0;i<n;i++){
					String num= Run.rel.elementAt(i).get_name() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayRel_GUI obj= new displayRel_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.rel.elementAt(i).get_email() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayRel_GUI obj= new displayRel_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.rel.elementAt(i).get_dob() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayRel_GUI obj= new displayRel_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.rel.elementAt(i).get_last_meet() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayRel_GUI obj= new displayRel_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				
				n= Run.pro.size();
				for(int i=0;i<n;i++){
					String num= Run.pro.elementAt(i).get_name() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPro_GUI obj= new displayPro_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.pro.elementAt(i).get_email() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPro_GUI obj= new displayPro_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.pro.elementAt(i).get_interests() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPro_GUI obj= new displayPro_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				
				n= Run.per.size();
				for(int i=0;i<n;i++){
					String num= Run.per.elementAt(i).get_name() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.per.elementAt(i).get_email() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.per.elementAt(i).get_context() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.per.elementAt(i).get_events() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.per.elementAt(i).get_date() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayPer_GUI obj= new displayPer_GUI(i);
						obj.frame.setVisible(true);
					}
				}
				
				n= Run.cas.size();
				for(int i=0;i<n;i++){
					String num= Run.cas.elementAt(i).get_name() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.cas.elementAt(i).get_email() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.cas.elementAt(i).get_how() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.cas.elementAt(i).get_info() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.cas.elementAt(i).get_when() + " ";
					if(num.equals(str) == true){
						flag=1;
						frame.setVisible(false);
						displayCas_GUI obj= new displayCas_GUI(i);
						obj.frame.setVisible(true);
					}
					num= Run.cas.elementAt(i).get_where() + " ";
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
		btnSearch.setBounds(164, 118, 117, 25);
		frame.getContentPane().add(btnSearch);
	}
}
