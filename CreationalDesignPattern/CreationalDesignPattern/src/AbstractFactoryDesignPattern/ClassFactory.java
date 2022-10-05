package AbstractFactoryDesignPattern;

public class ClassFactory implements AbstractFactory {
	
	@Override
	public Animal create(String a) {
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
