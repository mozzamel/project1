package modelOfCar;

public class Toyota18 {

	public static void main(String[] args) {
		// We cam't create object form interface and abstract method
		//Toyota15 mycar1 = new Toyota15();
		//Toyota16 mycar2 = new Toyora16();
		Toyota17 mycar3 = new Toyota17();
		mycar3.AntiBreak();
		mycar3.blutooth();
		mycar3.getFaster();
		mycar3.HdCamera();
		mycar3.remoteKey();	
	// Encapsulation	
		mycar3.setModel(2018);
		mycar3.setCarName("camry");
		System.out.println(mycar3.getModel()+ " " + mycar3.getCarName());
		// create another object car for another   information
		Toyota17 mycar4 = new Toyota17();
		mycar4.setCarName("subaru");
		mycar4.setModel(19);
		System.out.println(mycar4.getCarName() + " " + mycar4.getModel());
		
		
		
}

}
