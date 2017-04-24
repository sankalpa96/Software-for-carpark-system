package carParkSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("\n\t\tLOGIN\n ");//Login to the system
		String name="";
		String password="";
		while(!(name.equals("sankalpa")) || !(password.equals("2233"))){//check user name and password
		System.out.print("  \tEnter User Name : ");
		name=input.next();
		System.out.print("  \tEnter password  : ");
		password=input.next();
		
		
		if(!(name.equals("sankalpa")) || !(password.equals("2233"))){//if user name and password correct
		System.out.println("\t\tLOGIN FAIL");
		}else{
		System.out.println("\t\tLOGIN SUCCESS\n");//if user name and password wrong
		}
		
		}
		
		
		System.out.println("\t\t************** WELCOME TO WESTMINSTER CAR PARK **************");
		CarParkManager obj=new WestminsterCarParkManager();
		obj.methods();
		
		
		
		
		

	}

}
