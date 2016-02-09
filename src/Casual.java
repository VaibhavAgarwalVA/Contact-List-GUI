import java.io.*;
import java.util.*;

public final class Casual extends Person implements java.io.Serializable
{
	private String when;
	private String where;
	private String how;
	private String info;
	
	void set_when(String s){
		when = s;
	}
	void set_where(String s){
		where = s;
	}
	void set_how(String s){
		how = s;
	}
	void set_info(String s){
		info = s;
	}
	String get_when(){
		return when;
	}
	String get_where(){
		return where;
	}
	String get_how(){
		return how;
	}
	String get_info(){
		return info;
	}
	//methods
	
	//gets the details from the user
	void get_det()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		try{
			System.out.println("\n\nEnter the details for your casual contact.");
			System.out.print("Enter in a few words when you met: ");
			when = br.readLine();
			System.out.print("\nNow please enter where you first met: ");
			where = br.readLine();
			System.out.print("\nEnter in a few words how you met: ");
			how = br.readLine();
			System.out.print("\nEnter other useful information you wish to save: ");
			info = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	//shows details
	void show_det()
	{
		System.out.println("When you met: "+ when);	
		System.out.println("Where you met: "+ where);	
		System.out.println("How you met: "+ how);	
		System.out.println("Additional Info: "+ info);
		System.out.println("--------------------------------------------");		
	}
	
}