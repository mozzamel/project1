package modelOfCar;

public class Toyota17 extends Toyota16 implements Toyota15,StandtradClass{
	private int model;
	private String carName;
	
	public void AntiBreak() {
		System.out.println("prevent from stealing");
	}
	public void SpeedLimit() {
		System.out.println("it has speeding meter");
	}
	
	public void blutooth() {
		System.out.println("extra feature for songs");
		
	}
	
	public void getFaster() {
		
		System.out.println("this is would be fastest car");
	}
	
	public void remoteKey() {
		System.out.println("can strat from remote");
		
	}
	
	public void V6Engine() {
		System.out.println("powerfull engine");
	}
	
	public void small() {
		System.out.println("small engine");
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
		
	
	
}
