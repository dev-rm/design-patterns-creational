package singleton;

public class StaticSingletonDemo {
	
	private static StaticSingletonDemo instance = new StaticSingletonDemo();
	
	private StaticSingletonDemo() {}
	
	public static StaticSingletonDemo getInstance() {
		return instance;
	}
}
