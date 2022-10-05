package SingletonDesignPattern;

public class StaticBlockSingleton {
	
private static StaticBlockSingleton INSTANCE = null ;
	
	private StaticBlockSingleton() {}
	
	//gives option for exception handling(Eager initialization)
	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
