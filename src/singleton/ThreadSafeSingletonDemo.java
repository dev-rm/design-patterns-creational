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
			synchronized(ThreadSafeSingletonDemo.class) { //The instance may be null but when we synchronize it and check for null again and if another class has a lock on that it will then block our code and create the instance and return that synchronized lock to our code and then it checks for null again and since it's not null it doesn't need to create an instance of the class again.
				if(instance == null) { //It will run only when we are creating an instance for the very first time
					instance = new ThreadSafeSingletonDemo();
				}
			}
		}
		return instance;	
	}
}
