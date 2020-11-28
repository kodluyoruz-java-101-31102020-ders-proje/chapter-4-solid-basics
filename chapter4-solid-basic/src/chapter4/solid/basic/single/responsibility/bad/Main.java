package chapter4.solid.basic.single.responsibility.bad;

import chapter4.solid.basic.single.responsibility.good.Book;
import chapter4.solid.basic.single.responsibility.good.Pencil;
import chapter4.solid.basic.single.responsibility.good.Product;
import chapter4.solid.basic.single.responsibility.good.ProductDataExporter;
import chapter4.solid.basic.single.responsibility.good.ProductJsonExporter;
import chapter4.solid.basic.single.responsibility.good.ProductXmlExporter;

public class Main {

	public static void main(String[] args) {
		
		Product book = new Book("Java Kitabı", 100);
		Product pencil = new Pencil("Faber Castel", 10);
		
		ProductDataExporter<Product> productJsonExporter = new ProductJsonExporter<Product>();
		System.out.println(productJsonExporter.export(book));
		System.out.println(productJsonExporter.export(pencil));
		
		
		ProductDataExporter<Product> productXmlExporter = new ProductXmlExporter<Product>();
		System.out.println(productXmlExporter.export(book));
		System.out.println(productXmlExporter.export(pencil));
		
	}

}
