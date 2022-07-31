package workingWithMethods.business.abstracts;

import java.util.List;

import workingWithMethods.entities.Product;

public interface ProductService {
	public void add(Product product);
	
	public List<Product> getAll();
}
