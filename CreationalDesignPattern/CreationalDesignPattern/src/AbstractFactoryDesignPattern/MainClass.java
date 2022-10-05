package AbstractFactoryDesignPattern;


public class MainClass {

	public static void main(String[] args) {
		AbstractFactory factory= FactoryProvider.getFactory("Animal");
		Animal a=(Animal) factory.create("cat");	
		a.Speak();
	}

}
