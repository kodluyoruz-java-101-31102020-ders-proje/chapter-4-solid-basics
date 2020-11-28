package chapter4.solid.basic.single.responsibility.good;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ProductPDFExporter <T extends Product> implements ProductDataExporter<T>{

	@Override
	public String export(T product) {
		
		StringBuilder builder = new StringBuilder();
		builder.append(product.getName());
		builder.append(product.getPrice());
		
		byte[] content = builder.toString().getBytes();
		
		try {
			return new String(MessageDigest.getInstance("MD5").digest(content));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
