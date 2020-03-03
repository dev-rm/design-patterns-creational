package singleton;

public class LazyLoadedSingletonMain {

	public static void main(String[] args) {
		LazyLoadedSingletonDemo instance = LazyLoadedSingletonDemo.getInstance();
		
		System.out.println(instance);
		
		LazyLoadedSingletonDemo anotherInstance = LazyLoadedSingletonDemo.getInstance();
		
		System.out.println(anotherInstance);
	}
}
