package Builder;

public class Main {

	public static void main(String[] args) {
		 Laptop laptop = new Laptop.LaptopBuilder("16 gb", "240 gb", "2.5 hz").setBluetooth(true).build();
         System.out.println(laptop);
	}

}
