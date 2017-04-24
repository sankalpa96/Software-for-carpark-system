package carParkSystem;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Vehicle implements Serializable {
	
	Scanner sc =new Scanner(System.in);
	
	public String vId;
	public String vBrand;
	public String vType;
	public int vYear;
	public int vMonth;
	public int vDay;
	public int vHour;
	public int vMin;
	
	
	public int slot;
	public static String veh=null;
	
	public static String[] vehicle=new String[20];
	public static String[] id=new String[20];
	
	public static int[] date=new int [20];
	

	public static Vehicle []name=new Vehicle[20];
	
	public void setValue(){
		
	}
	public abstract void data(int x);
	public abstract String getId();
	public abstract String getBrand();
	public abstract String getType();
	public abstract int getYear();
	public abstract int getMonth();
	public abstract int getDay();
	public abstract int getHour();
	public abstract int getMinute();
	
	
}
