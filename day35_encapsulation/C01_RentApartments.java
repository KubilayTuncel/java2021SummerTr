package day35_encapsulation;

public class C01_RentApartments {
	
	
	private String name;
	private int roomCount;
	private boolean balconyOrNo;
	private int kira=0;
	
	public void setName(String name) {
		
		name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
		this.name=name;
		
		
	}

	public String getName() {
		
		return name;
		
	}
	
	public void setRoomCount(int roomCount) {
		
		this.roomCount=roomCount;
				
	}
	
	public int getRoomCount() {
		return roomCount;
	}
	
	public void setBalconyOrNo(boolean balconyOrNo) {
		
		this.balconyOrNo=balconyOrNo;
		
	}
	
	public boolean isbalconyOrNo() {
		return balconyOrNo;
	}
	public int kiraHesaplama(int roomCount) {
		
		if(roomCount==0) {
			this.kira=1400;
		}else if (roomCount==1) {
			this.kira=1700;
		}else if (roomCount==2) {
			this.kira=2200;
		}else if (roomCount==3) {
			this.kira=2700;
		}else {
			System.out.println("Hatali veri girdiniz.");
		}
		return kira;
	}
	
	public int balkonSor(boolean balconyOrNo) {
		
		if (balconyOrNo==true) {
			
			this.kira+=200;
			
		}
		
		return this.kira;
	}
	
}
