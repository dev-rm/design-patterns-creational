package singleton;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		ThreadSafeSingletonDemo instance = ThreadSafeSingletonDemo.getInstance();
		
		System.out.println(instance);
		
		ThreadSafeSingletonDemo anotherInstance = ThreadSafeSingletonDemo.getInstance();
		
		System.out.println(anotherInstance);
	}
}


