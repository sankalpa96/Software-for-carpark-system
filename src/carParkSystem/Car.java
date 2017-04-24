package carParkSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Car extends Vehicle implements Serializable{

	private   String []color=new String[20];
	private int []doors=new int[20];
	
	Car(){
		
	}
	
	Car(String id,String br,int yr,int mon,int dat,int hr,int mi,String type){
		
		vId=id;
		vBrand=br;
		vType=type;
		vYear=yr;
		vMonth=mon;
		vDay=dat;
		vHour=hr;
		vMin=mi;
		
		
		
		
	}

	   public void data(int x){
		
		slot=x;
		
		System.out.print("\tPlease Enter the Car colour :");
		color[slot]=sc.next();
		
		try{
		
		System.out.print("\tPlease Enter the No of doors :");
		doors[slot]=sc.nextInt();
		
		vehicle[slot]="car";
		veh="car";
		Date enter =new Date();
		enter.setEntryTime(slot);
		
		}catch(Exception e){
			System.out.println("Invalid Input");
			Vehicle validate=new Car();
			validate.data(x);
		
		}
		
		 }
	   
	 public String getId(){
		 return vId;
	 }
	 
	 public String getBrand(){
		 return vBrand;
	 }
		
	 public String getType(){
		 return vType;
	 }

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return vYear;
	}

	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return vMonth;
	}

	@Override
	public int getDay() {
		// TODO Auto-generated method stub
		return vDay;
	}

	@Override
	public int getHour() {
		// TODO Auto-generated method stub
		return vHour;
	}

	@Override
	public int getMinute() {
		// TODO Auto-generated method stub
		return vMin;
	}
	

}
