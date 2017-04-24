package carParkSystem;

import java.util.Scanner;

interface CarParkManager {
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	void methods();
	Vehicle carObj=new Car();
	
	String [] vID=carObj.id;
	String [] vType=carObj.vehicle;
	
	void add();
	void free();
	void display();
	void leave();
	void searchByDate();
	void saveFile();
	void readFile();
	Date obj=new Date();
	
	

}
