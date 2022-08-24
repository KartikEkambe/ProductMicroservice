package ProductMicroservice.ProductMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import ProductMicroservice.ProductMicroservice.model.Product_Category;

import ProductMicroservice.ProductMicroservice.services.Product_Category_Service;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = {"*"})

public class CategoryController {
	
	@Autowired
	Product_Category_Service cs;
	

	

	
	@GetMapping("/category")
	public List<Product_Category>GetAllCategory(){
		return cs.GetAllCategories();
	}
	
	@GetMapping("/category/{id}")
	public Product_Category GetCategoryById(@PathVariable("id")int id) {
		return cs.GetCategoryById(id);
	}
	
	@PostMapping("/category")
	public String AddCategory(@RequestBody Product_Category c) {
		cs.SaveCategory(c);
		return "Category Added Successfully";
	}
	
	@PutMapping("/category")
	public String UpdateCategory(@RequestBody Product_Category c) {
		cs.SaveCategory(c);
		return "Category Updated Successfully";
	}
	
	@DeleteMapping("/category/{id}")
	public String DeleteCategory(@PathVariable("id")int id) {
		cs.DeleteCategory(id);;
		return "Category Deleted Successfully";
	}
	
	
	
	

	
	
	
	

}
