package carParkSystem;

public class Motorbike extends Vehicle{
	
	
	Motorbike(String id,String br,int yr,int mon,int dat,int hr,int mi,String type){
		
		vId=id;
		vBrand=br;
		vType=type;
		vYear=yr;
		vMonth=mon;
		vDay=dat;
		vHour=hr;
		vMin=mi;
		
	}
	
	
	
	private String[] engine=new String[20];

	@Override
	public void data(int x) {

		slot=x;
		
		System.out.print("\tPlease Enter the Engine Capacity :");
		
		
		vehicle[slot]="motorbike";
		veh="Motor Bike";
		
		Date enter =new Date();
		enter.setEntryTime(slot);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return vId;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return vBrand;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
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
