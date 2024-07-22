package foo;

public class StaticBlockDemo { //counter=0
	static int counter;
	static { //execute only one time and always first at the time of class loading
		System.out.println("Static Block....");
	}
	public void incr() {
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) {
		StaticBlockDemo obj1=new StaticBlockDemo();
		StaticBlockDemo obj2=new StaticBlockDemo();
		StaticBlockDemo obj3=new StaticBlockDemo();
		
		obj1.incr();
		obj2.incr();
		obj3.incr();
	}

}
