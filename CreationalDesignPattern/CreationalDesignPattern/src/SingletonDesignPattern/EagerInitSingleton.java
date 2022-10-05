package SingletonDesignPattern;

public class EagerInitSingleton {
	
	//eager initialization(instance is created while loading the class file in memory)
	//Exception handling cannot be done here
	private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();
	
	private EagerInitSingleton() {}
	
	public static EagerInitSingleton getInstance() {
		return INSTANCE;
	}
	
	
}
