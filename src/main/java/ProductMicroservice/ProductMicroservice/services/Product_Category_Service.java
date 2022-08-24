package ProductMicroservice.ProductMicroservice.services;

import javax.transaction.Transactional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProductMicroservice.ProductMicroservice.model.Product_Category;
import ProductMicroservice.ProductMicroservice.repository.Product_Category_Repository;

@Service
@Transactional
public class Product_Category_Service {

	@Autowired
	Product_Category_Repository categoryrepository;
	
	public List<Product_Category> GetAllCategories(){
		List<Product_Category>lst=categoryrepository.findAll();
		List<Product_Category>lst1=new ArrayList<Product_Category>();
		for(Product_Category c:lst) {
			
			c.setProduct_type(null);
			lst1.add(c);
		}
		return lst1;
	}
	
	public Product_Category GetCategoryById(Integer category_id) {
		return categoryrepository.findById(category_id).get();
	}
	
	public void SaveCategory(Product_Category c) {
		 categoryrepository.save(c);
	}
	
	public void DeleteCategory(Integer category_id) {
		categoryrepository.deleteById(category_id);
		
	}
	
}
