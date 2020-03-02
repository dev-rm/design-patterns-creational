package singleton;

public class StaticSingletonMain {

	public static void main(String[] args) {
		StaticSingletonDemo instance = StaticSingletonDemo.getInstance();
		
		System.out.println(instance);
		
		StaticSingletonDemo anotherInstance = StaticSingletonDemo.getInstance();
		
		System.out.println(anotherInstance);
	}
}
