public class Class5 {
	class Engine {
		public void start()
		{
		System.out.println(" The engine is turned ON ");
		}
		public void drive()
		{
		System.out.println(" The engine is working and the
		car is driving ");
		}
		public void stop()
		{
		System.out.println(" The engine is turned OFF ");
		}
		}
		class Wheel {
		int diameter;
		Int pressure;
		public Wheel(){
		pressure=2;
		}
		public void precnik(int psi) {
		diameter=psi;
		System.out.println(“this wheele has diameter of "+ psi+”
		inches”);
		}
		public void inflate() {
			System.out.println(“The wheel is inflated. Inflate it”");
			}
			public void inflate(int BAR) {
			pressure=BAR;
			System.out.println("The inflate pressure is "+ BAR + " bars.");}
			}
			class Car_Window{
			String car_window;
			Car_Window(String cw){
			car_window=cw;
			}
			public void OpenWindow() {
			System.out.println("The "+ car_window +" car window is opened.");
			}
			public void CloseWindow() {
			System.out.println("The "+ car_window +" car window is closed");
			}
			}
			class Door {
			String door;
			public Car_Window car_win;
			public Door(String v){
			door=v;
			car_win = new Car_Window(door);
			}
			public void OpenDoor() {
			System.out.println("the "+door+ " door is opened");
			}
			public void CloseDoor()
			{
			System.out.println("the "+door+ " door is closed");
			}
			}
			public class Car {
			String CarColor;
			public Engine eng = new Engine();
			public Wheel[] wheel = new Wheel[4];
			public Door frontLeft = new Door("Front left"),
			frontRight= new Door("Front right"),
			trunk = new Door(“trunk"); // 3 doors
			public Car(String CarColor) {
			for(int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
			this.CarColor=CarColor;
			}
			public class Car {
			String CarColor;
			public Engine eng = new Engine();
			public Wheel[] wheel = new Wheel[4];
			public Door frontLeft = new Door("Front left"),
			frontRight= new Door("Front right"),
			trunk = new Door(“trunk"); // 3 doors
			public Car(String CarColor) {
			for(int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
			this.CarColor=CarColor;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
