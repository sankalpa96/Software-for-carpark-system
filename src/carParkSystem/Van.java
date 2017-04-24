package carParkSystem;

public class Van extends Vehicle {
	
	private String [] volume=new String[20];
	
	Van(String id,String br,int yr,int mon,int dat,int hr,int mi,String type){
		
		vId=id;
		vBrand=br;
		vType=type;
		vYear=yr;
		vMonth=mon;
		vDay=dat;
		vHour=hr;
		vMin=mi;
	}

	@Override
	public void data(int x) {
		
		slot=x;
		
		System.out.print("\tPlease Enter the cargo volume :");
		volume[slot]=sc.next();
		
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
