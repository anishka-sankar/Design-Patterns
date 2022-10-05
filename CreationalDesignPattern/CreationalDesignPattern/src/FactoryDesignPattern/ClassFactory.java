package FactoryDesignPattern;

public class ClassFactory {
	
	public Animal getObject(String a) {
		if(a.equals("dog")) {
			return new Dog();
		}
		else if(a.equals("cow")) {
			return new Cow();
		}
		else if(a.equals("cat")) {
			return new Cat();
		}
		return null;
	}
	
	
}
