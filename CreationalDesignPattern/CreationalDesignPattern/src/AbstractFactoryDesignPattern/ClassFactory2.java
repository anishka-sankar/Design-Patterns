package AbstractFactoryDesignPattern;




public class ClassFactory2 implements AbstractFactory<Birds>{

	@Override
	public Birds create(String a) {
		if(a.equals("peacock")) {
			return new Peacock();
		}
		else if(a.equals("parrot")) {
			return new Parrot();
		}
		return null;
	}

}
