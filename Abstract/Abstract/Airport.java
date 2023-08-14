package Abstract;

public abstract class Airport {

	public void control() {
		System.out.println("Invoking control method in contract constructor");
	}
	public void hangars() {
		System.out.println("Invoking hanger method in contract constructor");
	}
	public void taxiWays() {
		System.out.println("Invoking taxiWays method in contract constructor");
	}
	public void lounges() {
		System.out.println("Invoking lounges method in contract constructor");
	}
	public void foodServices() {
		System.out.println("Invoking foodServices method in contract constructor");
	}
	public abstract void restaurants();
	public abstract void emergenchServices();
	public abstract void security();
	public abstract boolean baggageHandling();
	public abstract void emergencyDoors();
}
