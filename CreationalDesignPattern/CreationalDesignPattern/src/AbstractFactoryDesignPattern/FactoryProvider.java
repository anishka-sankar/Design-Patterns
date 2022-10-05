package AbstractFactoryDesignPattern;



public class FactoryProvider {

	public static AbstractFactory getFactory(String choice) {
		if("Animal".equalsIgnoreCase(choice)) {
			 return new ClassFactory();
		 }
		 else if("Birds".equalsIgnoreCase(choice)) {
			 return new ClassFactory2();
		 }
		 return null;
	 }
	}

