package cooperation;

public class Taxi{
	String taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(String taxiNumber){
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money){
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(taxiNumber + "�� �°���" + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}