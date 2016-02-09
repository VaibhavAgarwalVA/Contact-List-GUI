import java.io.*;
import java.util.*;

public final class Personal extends Person implements java.io.Serializable
{
	private String context;
	private String events;
	private String date_of_meet;
	
	void set_context(String s){
		context= s;
	}
	void set_events(String s){
		events= s;
	}
	void set_date(String s){
		date_of_meet= s;
	}
	
	String get_context(){
		return context;
	}
	String get_events(){
		return events;
	}
	String get_date(){
		return date_of_meet;
	}
	
	//methods
	void get_det()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		try{
			System.out.println("\n\nEnter the details for your personal contact.");
			System.out.print("Enter in a few words the context of your acquaintance: ");
			context = br.readLine();
			System.out.print("\nNow please enter any memorable event(s), in a single input string: ");
			events = br.readLine();
			System.out.print("\nEnter the date of your acquaintance (dd/mm/yyyy): ");
			date_of_meet = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("Context of meeting: "+ context);	
		System.out.println("Specific events: "+ events);	
		System.out.println("Date of meeting: "+ date_of_meet);	
		System.out.println("--------------------------------------------");		
	}
	
}