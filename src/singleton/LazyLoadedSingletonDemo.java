package singleton;

public class LazyLoadedSingletonDemo {
private static LazyLoadedSingletonDemo instance = null;
	
	private LazyLoadedSingletonDemo() {}
	
	public static LazyLoadedSingletonDemo getInstance() {
		//This ensures that not all the instances are getting eagerly fetched at the startup of an application. 
		//Hence the app comes up quicker and it's not a memory hog when code is being spooled up like here
		if(instance == null) { //if the instance is null
			instance = new LazyLoadedSingletonDemo(); //spool up a new instance
		}
		return instance;
	}
}
