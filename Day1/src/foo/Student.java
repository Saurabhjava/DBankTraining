package foo;

class Person {
	public Person() {
		System.out.println("Person Default");
	}
	public Person(String name) {
		this();
		System.out.println("Person Parameter");
	}
}
public class Student extends Person {
	public Student() {
		super("hhghg");
		System.out.println("Student Default");
	}
	public Student(int sid) {
		this();
		System.out.println("Student Parameter");
	}
}
