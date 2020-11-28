package chapter4.solid.basic.single.responsibility.good;

public interface ProductDataExporter <T extends Product> {

	String export(T product);
	
}
