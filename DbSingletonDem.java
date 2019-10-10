

class DbSingleton {
	
	private static DbSingleton instance = new DbSingleton();
	
	private DbSingleton() {};
	
	public static DbSingleton getInstance() {
		return instance;
	}
}

public class DbSingletonDem {
	
	public static void main (String args[]) {
		//DbSingleton obj1 = new DbSingleton(); ==> The constructor DbSingleton() is not visibl
	
	
	DbSingleton ob1 = DbSingleton.getInstance();
	DbSingleton ob2 = DbSingleton.getInstance();
	
	System.out.println("ob1 = " + ob1 + " ob2 = " + ob2 + " are they same ?= "+ (ob1==ob2));
	}
}
