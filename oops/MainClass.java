package oops;

class Cat{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	
	public void eat() {
		System.out.println("Car is Eating");
	}
	
	public void description() {
		System.out.println("My cat has "+legs+" legs and "+eyes+" eyes.");
	}
}

class Dog{
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		
		cat1.legs=4;
		cat1.eyes=54;
		
		cat2.legs=348772;
		cat2.eyes=39874;
		
		cat1.walk();
		cat2.eat();
		
		cat1.description();
		cat2.description();
	}

}
