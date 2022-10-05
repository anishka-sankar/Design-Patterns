package SingletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyInitSingleton singleton = LazyInitSingleton.getInstance();
		System.out.println(LazyInitSingleton.getInstance()); // same hash code
		
		
		
		
	}

}
