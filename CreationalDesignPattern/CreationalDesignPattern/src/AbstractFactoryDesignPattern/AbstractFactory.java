package AbstractFactoryDesignPattern;

public interface AbstractFactory<T> {
	T create(String type);

}
