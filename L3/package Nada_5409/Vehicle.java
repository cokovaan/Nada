public class Vehicle {
class Car {
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;


Car() {
	type="";
	no_seats=0;
	fuel="";
	body_color="";
}
Car (String type, int seats, String fuel, String body_color) {
	this.type=type;
	this.no_seats=seats;
	this.fuel=fuel;
	this.body_color=body_color;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type=type;
}
}
public int no_seats() {
	return no_seats;
}
public void no_seats(int seats) {
	this.no_seats = seats;
}
public String getFuel() {
	return fuel;
}
public void setFuel(String fuel) {
	this.fuel = fuel;
}
public String getBody_color() {
	return body_color;
}
public void setBodyColor() {
	return body_color;
}
}
public class Vehicle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car A = new Car("BMW", "diesel", "black");
		Car B = new Car();
		System.out.println("Car 1:");
		System.out.println("Car 1 is type:" + A.getType);
		System.out.println("Car 1 has seats: "+A.getSeats());
		System.out.println("Car 1 uses fuel: "+A.getFuel());
		System.out.println("Color of car 1 is: "+A.getBodyColor());
		System.out.println();
		System.out.println("Car 2: ");
		System.out.println("Car 2 is type: "+B.getType());
		System.out.println("Car 2 has seats "+B.getSeats());
		System.out.println("Car 2 uses fuel: "+B.getFuel());
		System.out.println("Color of car 2 is: "+B.getBodyColor());
		

		B.setType("BMW");
		B.setSeats(5);
		B.setFuel("diesel");
		B.setBodyColor("black");
		System.out.println();
		System.out.println("Car 2: ");
		B.spec();
		

		if(A.getSeats()>B.getSeats()) {
			System.out.println("Car 1 has more seats");
		}
		else if(B.getSeats()>A.getSeats()) {
			System.out.println("Car 2 has more seats");
		}
		else {
			System.out.println("The cars have equal number of seats");
	}

}
