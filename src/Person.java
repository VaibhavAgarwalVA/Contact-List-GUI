import java.io.*;
import java.util.*;

public class Person implements java.io.Serializable
{	
	//shared by all subclasses
	protected String name;
	protected long mobile_no;
	protected String email;
	
	void set_name(String s){
		name = s;
	}
	void set_mobile(long n){
		mobile_no = n;
	}
	void set_email(String s){
		email = s;
	}
	String get_name(){
		return name;
	}
	long get_mobile(){
		return mobile_no;
	}
	String get_email(){
		return email;
	}
	
	//methods
	//gets the basic details shared by all subclasses
	void basic_det(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		try{
			System.out.println("\n\nEnter the basic details first.");
			System.out.print("Name of contact: ");
			name= br.readLine();
			System.out.print("\nMobile number: ");
			mobile_no= Long.parseLong(br.readLine());
			System.out.print("\nEmail ID: ");
			email= br.readLine();
		}
		catch(Exception e){
			System.out.println("Please enter valid credentials in the apt format"); 
		}
	}
	
	//displays basic details
	void display_basic(){
		System.out.println("Name : "+ name);
		System.out.println("Mobile Number : "+ mobile_no);
		System.out.println("Email ID : "+ email);
		System.out.println("-----------------------------");
	}
	
	boolean search_name(String n) {
		if(n.equals(name) == true)
			return true;
		return false;	
	}
	
	boolean search_number(long n) {
		if( (n==mobile_no) == true)
			return true;
		return false;	
	}
	
	boolean search_email(String n) {
		if(n.equals(email) == true)
			return true;
		return false;	
	}
}