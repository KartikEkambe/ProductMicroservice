package ProductMicroservice.ProductMicroservice.controller;

import java.util.List;

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

import ProductMicroservice.ProductMicroservice.model.Product_Type;
import ProductMicroservice.ProductMicroservice.services.Product_Type_Service;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = {"*"})

public class ProductTypeController {
	@Autowired
	Product_Type_Service ts;
	
	
	@GetMapping("/producttype")
	public List<Product_Type>GetAllProductType(){
		return ts.GetAllTypes();
	}
	
	@GetMapping("/producttype/{id}")
	public Product_Type GetTypeById(@PathVariable("id")int id) {
		return ts.GetProductTypeById(id);
	}
	
	@PostMapping("/product/type")
	public String AddType(@RequestBody Product_Type t) {
		ts.SaveProductType(t);
		return "Product Type Added Successfully";
	}
	
	@PutMapping("/producttype")
	public String UpdateType(@RequestBody Product_Type t) {
		ts.SaveProductType(t);
		return "Product Type Updated Successfully";
	}
	
	
	@DeleteMapping("/producttype/{id}")
	public String DeleteType(@PathVariable("id")int id) {
		ts.DeleteProductType(id);
		return "Product Type Deleted Successfully";
	}

}
