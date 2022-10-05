package FactoryDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		ClassFactory cf=new ClassFactory();
		Animal animal=cf.getObject("dog");
		animal.Speak();
	}

}
