package ProductMicroservice.ProductMicroservice.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProductMicroservice.ProductMicroservice.model.Product;
import ProductMicroservice.ProductMicroservice.model.Product_Type;
import ProductMicroservice.ProductMicroservice.repository.Product_Category_Repository;
import ProductMicroservice.ProductMicroservice.repository.Product_Repository;
import ProductMicroservice.ProductMicroservice.repository.Product_Type_Repository;

@Service
@Transactional
public class Product_Service {
	@Autowired
	Product_Repository repository;
	
	@Autowired
	Product_Category_Repository categoryrepository;
	
	@Autowired
	Product_Type_Repository typerepository;
	
	
	
	public List<Product>GetAllProducts(){
		
		List<Product>lst=repository.findAll();
		List<Product>lst1=new ArrayList<Product>();
		
		for(Product p : lst) {
			p.getCategory();
			p.getProduct_type();
			
			lst1.add(p);
			
		}
		return lst1;
	}
	
	public Product GetProductById(Integer product_id) {
		return repository.findById(product_id).get();
	}
	
	public void saveProduct(Product p) {
		repository.save(p);
	}
	public void DeleteProduct(Integer product_id) {
		repository.deleteById(product_id);
	}

}
