import java.io.*;
import java.util.*;

public final class Professional extends Person implements java.io.Serializable
{
	private String interests;
	
	void set_interests(String s){
		interests = s;
	}
	String get_interests(){
		return interests;
	}
	
	//methods
	void get_det()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		try{
			System.out.println("\n\nEnter the details for your professional contact.");
			System.out.print("Enter your common professional interests: ");
			interests = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("Common Professional Interests: "+ interests);	
		System.out.println("--------------------------------------------");		
	}
}