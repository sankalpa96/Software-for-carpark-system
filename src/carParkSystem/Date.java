package carParkSystem;

import java.io.Serializable;
import java.util.Scanner;

public class Date implements Serializable{
	
	public static int []month=new int[20];
	public static int []day=new int[20];
	public static int []hour=new int[20];
	public static int []min=new int[20];
	public static int []lmonth=new int[20];
	public static int []lday=new int[20];
	public static int []lhour=new int[20];
	public static int []lmin=new int[20];
	
	
	
	public static int pSlot;
	
	Vehicle carObj=new Car();
	Vehicle []dateInfo=carObj.name;

	
	int lMonth,lDay,lHour,lMin,eMonth,eDay,eHour,eMin,dMin,dHour,dMonth,dDay;
	
	


	Scanner sc=new Scanner(System.in);
	
	
	public void setEntryTime(int index){
		
		
		month[index]=dateInfo[index].vMonth;
		day[index]=dateInfo[index].vDay;
		hour[index]=dateInfo[index].vHour;
		min[index]=dateInfo[index].vMin;
		
		
		
		
		}
	
	
	public void LeaveTime(int vNo){
		Date data=new Date();
		System.out.println("pls enter the leaving date and time as following order");
		
		pSlot=vNo;
		
		
		System.out.print("\tmonth:");
		lmonth[pSlot]=sc.nextInt();
		
		while(lmonth[pSlot]<1 || lmonth[pSlot] >12){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\tmonth:");
			lmonth[pSlot]=sc.nextInt();
			
		}
		System.out.print("\tday :");
		lday[pSlot]=sc.nextInt();
		
		while(lday[pSlot]<1 || lday[pSlot] >31){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\tday :");
			lday[pSlot]=sc.nextInt();
			
		}
		System.out.print("\thour:");
		lhour[pSlot]=sc.nextInt();
		
		while(lhour[pSlot]<1 || lhour[pSlot] >23){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\thour:");
			lhour[pSlot]=sc.nextInt();
			
		}
		System.out.print("\tminute:");
		lmin[pSlot]=sc.nextInt();
		
		while(lmin[pSlot]<1 || lmin[pSlot] >59){
			System.out.println("Invalid input. Please check before you Enter !\n");
			System.out.print("\tminute:");
			lmin[pSlot]=sc.nextInt();
			
		}
		data.TimeDifference(pSlot);
		
		
	}
	
	public void TimeDifference(int vehiNo){
		
		eMonth=month[vehiNo];
		eDay=day[vehiNo];
		lMonth=lmonth[vehiNo];
		lDay=lday[vehiNo];
		
		eHour=hour[vehiNo];
		eMin=min[vehiNo];
		lHour=lhour[vehiNo];
		lMin =lmin[vehiNo];
		
		/*System.out.println(eHour);
		System.out.println(eMin);
		System.out.println(lHour);
		System.out.println(lMin);*/
		
		if(lDay>=eDay){
			dDay=lDay-eDay;
		}else{
			dDay=(30+lDay)-eDay;
		}
		
		if(lMonth>=eMonth){
			if(lDay<eDay){
				dMonth=(lMonth - 1)-eMonth;
				
			}else{
				dMonth=lMonth - eMonth;
			}
		}else{
			if(lDay<eDay){
				dMonth=(12+(lMonth-1))-eMonth;
			}else{
				dMonth=(12+lMonth)-eMonth;
			}
		}
		
		
		
		
		
		
		
	    if(lMin>=eMin){
	    dMin=lMin-eMin;
	    
	    }else{
	    dMin=(60+lMin)-eMin;
	     }
	    if(lHour>=eHour){
	        if(lMin<eMin){
	       dHour=(lHour-1)-eHour;
	        }else{
	        
	          dHour=lHour-eHour;
	        }
	     }else{
	          if(lMin<eMin){
	       dHour=(24+(lHour-1))-eHour;
	          }else{
	          dHour=(24+lHour)-eHour;
	          }
	    }
	    
	    if(dHour>12)
	    	dDay-=1;
	    System.out.println("\tThe Time Period Vehicle Has been parked\n");
	    
	 
	    System.out.println("\t\tMonths  :"+dMonth);
	    System.out.println("\t\tDays    :"+dDay);
	    System.out.println("\t\tHours   :"+dHour);
	    System.out.println("\t\tMinutes :"+dMin);
		
	    Date money=new Date();
	    money.Charges(dMonth, dDay, dHour,dMin,vehiNo);
	}
	
	
	public void Charges(int month,int day,int hour,int min,int no){
		int cash1=(month*30*30)+day*30;
		int cash2;
		int cash3=0;
		if(hour>3)
			cash2=3*3+(hour-3);
		else
			cash2=hour*3;
		
		if(min>0)
			cash3=3;
		
		Vehicle carObj=new Car();
		String [] vType=carObj.vehicle;
		
		
		System.out.println("\nTotal Charges :"+(cash1+cash2+cash3)+"€");
		String type=dateInfo[no].getType();
		dateInfo[no]=null;
		System.out.println("\n\tType of Vehicle deleted - "+type);
	}
	
	
}



