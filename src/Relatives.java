import java.io.*;
import java.util.*;

public final class Relatives extends Person implements java.io.Serializable
{
	private String dob;
	private String last_meet;
	
	void set_dob(String s){
		dob= s;
	}
	void set_last_meet(String s){
		last_meet= s;
	}
	String get_dob(){
		return dob;
	}
	String get_last_meet(){
		return last_meet;
	}
	
	//methods
	void get_det()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		try{
			System.out.println("\n\nEnter the details for your relative.");
			System.out.print("Enter the date of birth of the contact: ");
			dob = br.readLine();
			System.out.print("\nNow please enter the date of your last meeting: ");
			last_meet = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("Date of birth: "+ dob);	
		System.out.println("Last meeting date: "+ last_meet);	
		System.out.println("--------------------------------------------");		
	}
}
