public class LazySingleton {
	private static LazySingleton uniqueinstance;
	private static int counter = 0;
	private LazySingleton() {
		counter++;
		System.out.println("Counter : " + counter);	
	}

	public static LazySingleton getInstance() {
		if (uniqueinstance == null) {
			uniqueinstance = new LazySingleton();
        	}
        	return uniqueinstance;
    	}

	public static void main(String[] args) {
		LazySingleton s1 = LazySingleton.getInstance();
		LazySingleton s2 = LazySingleton.getInstance();
	}
}
