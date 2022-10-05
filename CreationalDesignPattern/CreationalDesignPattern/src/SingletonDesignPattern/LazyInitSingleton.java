package SingletonDesignPattern;

public class LazyInitSingleton {
	
	//Lazy Initialization(instance is created only when the getInsatnce() is called)
    private static final  LazyInitSingleton INSTANCE = null;
	
	private LazyInitSingleton() {}
	
	public static  LazyInitSingleton getInstance() {
		if(INSTANCE == null) {
			return new LazyInitSingleton();
		}
		return INSTANCE;
	}
	
}
