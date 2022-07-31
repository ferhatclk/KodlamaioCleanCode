package workingWithMethods.dataAccess.concretes.NHibernateDal;

import java.util.ArrayList;
import java.util.List;

import workingWithMethods.dataAccess.abstracts.ProductDal;
import workingWithMethods.entities.Product;

public class NhProductDal implements ProductDal{
	private List<Product> products; 
	
	public NhProductDal() {
		products = new ArrayList<>();
	}

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " : NHibernate ile veritabanýna eklendi");
		products.add(product);
		
	}

	@Override
	public List<Product> getAll() {
		return products;
	}

}
