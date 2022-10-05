package SingletonDesignPattern;

public class ThreadSafeSingleton {
	
	//Lazy Initialization(instance is created only when the getInsatnce() is called)
	 private static final  ThreadSafeSingleton INSTANCE = null;
		
		private ThreadSafeSingleton() {}
		
		// This is thread safe but it reduces performance since the synchronized is used in method itself. To avoid that we can use synchronized block only for the condition 
	/*	public synchronized static  ThreadSafeSingleton getInstance() {
			if(INSTANCE == null) {
				return new ThreadSafeSingleton();
			}
			return INSTANCE;
		}
		
	*/
		
		public synchronized static  ThreadSafeSingleton getInstance() {
			if(INSTANCE == null) {
				synchronized(ThreadSafeSingleton.class) {
					if(INSTANCE == null) { // double checking so that if thread wrongly recognizes instance is null and enters.
						return new ThreadSafeSingleton(); 
					}
				}
				
			}
			return INSTANCE;
		}
		
		
		
}
