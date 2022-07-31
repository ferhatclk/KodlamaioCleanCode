package workingWithMethods.dataAccess.abstracts;

import java.util.List;

import workingWithMethods.entities.Product;


public interface ProductDal {
	public void add(Product product);
	public List<Product> getAll();
}
