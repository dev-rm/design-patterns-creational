package singleton;

public class ThreadSafeSingletonDemo {
	
	private static ThreadSafeSingletonDemo instance = null;
	
	private ThreadSafeSingletonDemo() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
			//This ensures that Reflection class cannot create an instance of the Singleton Class
		}
	}
	
	public static ThreadSafeSingletonDemo getInstance() {
		if(instance == null) {
			synchronized(ThreadSafeSingletonDemo.class) {
				if(instance == null) {
					instance = new ThreadSafeSingletonDemo();
				}
			}
		}
		return instance;	
	}
}
