package carParkSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class WestminsterCarParkManager implements CarParkManager,Serializable{
	
	private String idPlate;
	private String brand;
	private String type;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int min;
	public static int parkNo;
	
	
	Vehicle carbj=new Car();
	Vehicle []info=carbj.name;
	
	
	public void methods(){
		
		int input=0;
		WestminsterCarParkManager park=new WestminsterCarParkManager();
		
		
		while(input!=8){
			
		System.out.println("\n Please choose a number\n");
		System.out.println("\t\t1 - Add vehicle to the park");
		System.out.println("\t\t2 - Display vehicles in the park");
		System.out.println("\t\t3 - Display Free Parking Spaces");
		System.out.println("\t\t4 - Delete Vehicle By ID");
		System.out.println("\t\t5 - Search Vehicle By date");
		System.out.println("\t\t6 - Save file");
		System.out.println("\t\t7 - read file");
		System.out.println("\t\t8 - Exit");
		
		
		
		
		do{
			System.out.print("NO :");
		 input=sc.nextInt();
		}while(input<0 || input>8);
		
		
		
		if(input==1)
			park.add();
		if(input==2)
			park.display();
		if(input==3)
			park.free();
		if(input==4)
			park.leave();
		if(input==5)
			park.searchByDate();
		if(input==6)
			park.saveFile();
		if(input==7)
			park.readFile();
		
			
			
		
		}
		
		
		System.out.println("Good Day");
		
		
		
	
			
		}
		
		
	
	
	

	
	public void add(){
		
		
		System.out.println("\nSelect the NO of your vehicle type");
		System.out.println("\n\t1 - CAR\n\t2 - VAN\n\t3 - MOTORBIKE");
		System.out.print("\nEnter Here:");
		
		int vhcl=sc.nextInt();
		while(vhcl<0 || vhcl>3){
			System.out.println("\tWrong Input please ReEnter");
			System.out.print("\nEnter Here:");
			 vhcl=sc.nextInt();
		}
			
		System.out.print("\nEnter Parking Slot No :");
		 parkNo=sc.nextInt()-1;
		while(parkNo<0 || parkNo>19){
			System.out.println("Wrong Input");
			System.out.print("\nEnter Parking Slot No :");
			 parkNo=sc.nextInt()-1;
		}
		if(info[parkNo]==null){
			
			
			System.out.print("\tPlease Enter the ID Plate NO :");
			idPlate=sc.next();
			System.out.print("\tPlease Enter the  Brand :");
			brand=sc.next();
			System.out.println("pls enter the entry date and time as following order (time in 24 hours)");
			System.out.print("\tyear:");
			year=sc.nextInt();
			while(year<2000 || year> 2016){
				System.out.println("Invalid input. Please check before you Enter !");
				System.out.print("\tyear:");
				year=sc.nextInt();
			}
			System.out.print("\tmonth:");
			month=sc.nextInt();
			while(month<1 || month> 12){
				System.out.println("Invalid input. Please check before you Enter !\n");
				System.out.print("\tmonth:");
				month=sc.nextInt();
			}
			System.out.print("\tday :");
			day=sc.nextInt();
			while(day<1 || day> 31){
				System.out.println("Invalid input. Please check before you Enter !\n");
				System.out.print("\tday :");
				day=sc.nextInt();
			}
			System.out.print("\thour:");
			hour=sc.nextInt();
			while(hour<0 || hour> 23){
				System.out.println("Invalid input. Please check before you Enter !\n");
				System.out.print("\thour:");
				hour=sc.nextInt();
			}
			System.out.print("\tminute:");
			min=sc.nextInt();
			while(min<0 || min> 59){
				System.out.println("Invalid input. Please check before you Enter !\n");
				System.out.print("\tminute:");
				min=sc.nextInt();
			}
		
			
			
		if(vhcl==1){
			info[parkNo]=new Car(idPlate,brand,year,month,day,hour,min,"car");
			info[parkNo].data(parkNo);
			
		}else if(vhcl==2){
			info[parkNo]=new Van(idPlate,brand,year,month,day,hour,min,"van");
			info[parkNo].data(parkNo);
		}else{
			info[parkNo]=new Motorbike(idPlate,brand,year,month,day,hour,min,"motorbike");
			info[parkNo].data(parkNo);
		}
			
		}else{
			System.out.println("The parking slot is already booked. pls choose another or delete it");
		}
		
		
		
		
		
	}
	
	public void free(){
		
		 for(int y=0;y<info.length;y++){
			 if(info[y]==null)
				 System.out.println("  "+(y+1)+" - Not Used");
			 else
				 System.out.println("  "+(y+1)+" -  Used");
		 }
		
	}
	
	public void display(){
		double carNo=0;
		double vanNo=0;
		double motorNo=0;
		
		
		System.out.println("\nVehicle ID\tVehicle Type\tDate(year:month:day)\tTime(Hour:minute)");
		for(int a=0;a<info.length;a++){
			if(info[a]!=null){
				idPlate=info[a].getId();
				type=info[a].getType();
				if(info[a].getType().equals("car")){
					
					type="car      ";
					carNo++;
				}else if(info[a].getType().equals("van")){
					type="van      ";
					vanNo++;
			}else
					motorNo++;
				year=info[a].getYear();
				month=info[a].getMonth();
				day=info[a].getDay();
				hour=info[a].getHour();
				min=info[a].getMinute();
				
				
				
				
				System.out.println(idPlate+"\t\t"+type+"\t\t"+year+":"+month+":"+day+"\t\t"+hour+":"+min);
			}
				
		}
		
		double carP=(carNo/20)*100;
		double vanP =(vanNo/20)*100;
		double motorP=(motorNo/20)*100;
		String last=carbj.veh;
		
		System.out.println("\n\n\t\t *****Vehicle precentage in CarPark*****\n\n");
		System.out.println("\tCar   :"+carP+"%");
		System.out.println("\tVan   :"+vanP+"%");
		System.out.println("\tMotor :"+motorP+"%");
		
		System.out.println("\n\t Last Parked Vehicle type :"+last);
	}
	
	/*public void delete(){
		try{
		System.out.println("\tPlease Enter the ID NO of the Vehicle");
		String id=sc.next();
		boolean status=false;
		
		for(int a=0;a<info.length;a++){
			if(info[a]!=null){
				type=info[a].getType();
				
				if(info[a].getId().equals(id)){
					info[a]=null;
					System.out.println("\n\tType of Vehicle deleted - "+type);
					status=true;
				}
				
				
			}
				
		}
		
		if(!status)
			System.out.println("NO vehicle found with that ID");
		
		}catch(Exception e){
			System.err.println("Input number greater than 0\n");
			delete();
			
		}
		
	}*/
	
	public void print(){
		System.out.println(carObj.veh);
	}
	
	public void leave(){
		
		
		System.out.println("\tPlease Enter the ID NO of the Vehicle");
		String id=sc.next();
		boolean status=false;
		
		for(int a=0;a<info.length;a++){
			if(info[a]!=null){
				type=info[a].getType();
				
				if(info[a].getId().equals(id)){
					obj.LeaveTime(a);
					status=true;
				}
				
				
			}
				
		}
		
		if(!status)
			System.out.println("NO vehicle found with that ID");
		
	}
	
	
	public void searchByDate(){
		
		System.out.println("pls enter the entry date and time as following order");
		System.out.print("\tyear:");
		year=sc.nextInt();
		while(year<2000 || year> 2016){
			System.out.println("Invalid input. Please check before you Enter !");
			System.out.print("\tyear:");
			year=sc.nextInt();
		}
		System.out.print("\tmonth:");
		month=sc.nextInt();
		while(month<1 || month> 12){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\tmonth:");
			month=sc.nextInt();
		}
		System.out.print("\tday :");
		day=sc.nextInt();
		while(day<1 || day> 31){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\tday :");
			day=sc.nextInt();
		}
		boolean status=false;
		
		for(int a=0;a<info.length;a++){
			if(info[a]!=null){
				
				
				if(info[a].getYear()==year && info[a].getMonth()==month && info[a].getDay()==day){
					idPlate=info[a].getId();
					brand=info[a].getBrand();
					type=info[a].getType();
					
					System.out.println("\n\tVehicle ID  :"+idPlate);
					System.out.println("\tVehicle Brand :"+brand);
					System.out.println("\tVehicle Type :"+type);
					status=true;
				}
				
				
			}
				
		}
		
		if(!status)
			System.out.println("NO vehicle Was found ");
		
		
		
	}
	
	
	public void saveFile(){
		
		

		
			File file=new File("vehicleInformation.txt");
			try {
				FileOutputStream fo=new FileOutputStream(file);
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				
				oo.writeObject(info);
				oo.close();
				fo.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
	        System.out.println("File not found");	
	        } catch (IOException e) {
				// TODO Auto-generated catch block
			}
		
	}
	
	
	public void readFile(){
		
		File file=new File("vehicleInformation.txt");
		
		try {
			
			FileInputStream fi=new FileInputStream(file);
			ObjectInputStream oi=new ObjectInputStream(fi);
			 info=(Vehicle[])oi.readObject();
			
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
        // System.out.println("file not found");
			e.printStackTrace();

         } catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		for(int a=0;a<20;a++)
			System.out.println(info[a]);
		
		
	}

	
}
