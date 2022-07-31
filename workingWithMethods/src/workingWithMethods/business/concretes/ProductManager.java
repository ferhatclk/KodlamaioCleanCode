package workingWithMethods.business.concretes;

import java.util.List;

import workingWithMethods.business.abstracts.ProductService;
import workingWithMethods.dataAccess.abstracts.ProductDal;
import workingWithMethods.entities.Product;

public class ProductManager implements ProductService{
	private ProductDal productDal;
	
	
	public ProductManager(ProductDal productDal) {
		this.productDal = productDal;
	}

	@Override
	public void add(Product product) {
		productDal.add(product);
		
	}

	@Override
	public List<Product> getAll() {
		return productDal.getAll();
	}

}
