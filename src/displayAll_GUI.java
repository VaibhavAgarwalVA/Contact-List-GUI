import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class displayAll_GUI extends JFrame{

	public JFrame frame;
	private JTable table;
	private JPanel topPanel;
	private	JScrollPane scrollPane;

	/**
	 * Create the application.
	 */
	public displayAll_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle( "Contacts Table" );
	//	frame.getContentPane().setLayout(null);
		
//		topPanel = new JPanel();
//		topPanel.setLayout( new BorderLayout() );
//		frame.getContentPane().add(topPanel);
		
		Vector<String> columns = new Vector<String>();
		columns.addElement("Type");
		columns.addElement("Name of contact");
		columns.addElement("Contact Number");
		columns.addElement("Email-ID");
		
		int n= Run.rel.size() + Run.pro.size() + Run.per.size() + Run.cas.size();
		Vector < Vector <String> > rows = new Vector < Vector <String> >();
		n= Run.rel.size();
		for(int i=0;i<n;i++){
			Vector <String> vec = new Vector <String>();
			vec.addElement("Relatives");
			vec.addElement(Run.rel.elementAt(i).get_name());
			vec.addElement(Run.rel.elementAt(i).get_mobile() + " ");
			vec.addElement(Run.rel.elementAt(i).get_email());
			rows.addElement(vec); 
		}
		n= Run.pro.size();
		for(int i=0;i<n;i++){
			Vector <String> vec = new Vector <String>();
			vec.addElement("Professional");
			vec.addElement(Run.pro.elementAt(i).get_name());
			vec.addElement(Run.pro.elementAt(i).get_mobile() + " ");
			vec.addElement(Run.pro.elementAt(i).get_email());
			rows.addElement(vec); 
		}
		n= Run.per.size();
		for(int i=0;i<n;i++){
			Vector <String> vec = new Vector <String>();
			vec.addElement("Personal");
			vec.addElement(Run.per.elementAt(i).get_name());
			vec.addElement(Run.per.elementAt(i).get_mobile() + " ");
			vec.addElement(Run.per.elementAt(i).get_email());
			rows.addElement(vec); 
		}
		n= Run.cas.size();
		for(int i=0;i<n;i++){
			Vector <String> vec = new Vector <String>();
			vec.addElement("Casual");
			vec.addElement(Run.cas.elementAt(i).get_name());
			vec.addElement(Run.cas.elementAt(i).get_mobile() + " ");
			vec.addElement(Run.cas.elementAt(i).get_email());
			rows.addElement(vec); 
		}
		
		table = new JTable(rows,columns);
		table.setBounds(427, 31, -399, 229);
		
		scrollPane = new JScrollPane( table );
		//topPanel.add( scrollPane, BorderLayout.CENTER );
		frame.add(scrollPane);
		
		frame.setSize(600,400);
		frame.setVisible(true);
		
	}
}
