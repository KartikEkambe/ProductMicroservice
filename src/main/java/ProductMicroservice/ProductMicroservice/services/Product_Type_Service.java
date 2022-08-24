package ProductMicroservice.ProductMicroservice.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProductMicroservice.ProductMicroservice.model.Product_Type;

import ProductMicroservice.ProductMicroservice.repository.Product_Type_Repository;

@Service
@Transactional
public class Product_Type_Service {
	@Autowired
	Product_Type_Repository typerepository;
	
	
	
	public List<Product_Type>GetAllTypes(){
		List<Product_Type>lst=typerepository.findAll();
		List<Product_Type>lst1=new ArrayList<Product_Type>();
		for(Product_Type t:lst) {
			t.getCategory();
			t.getProduct();
			
			lst1.add(t);
		}
		return lst1;
	}
	
	public Product_Type GetProductTypeById(Integer product_type_id ) {
		return typerepository.findById(product_type_id).get();
	}
	
	public void SaveProductType(Product_Type t) {
		typerepository.save(t);
	}
	
	public void DeleteProductType(Integer product_type_id) {
		typerepository.deleteById(product_type_id);
	}
}
