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

import ProductMicroservice.ProductMicroservice.model.Product;
import ProductMicroservice.ProductMicroservice.services.Product_Service;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = {"*"})

public class ProductController {
	@Autowired
	Product_Service ps;
	
	@GetMapping("/product")
	public List<Product>GetAllProduct(){
		return ps.GetAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product GetProductById(@PathVariable("id")int id) {
		return ps.GetProductById(id);
	}
	
	@PostMapping("/product")
	public String AddProduct(@RequestBody Product p) {
		ps.saveProduct(p);
		return "Product  Added Successfully";
	}
	
	@PutMapping("/product")
	public String UpdateProduct(@RequestBody Product p) {
		ps.saveProduct(p);
		return "Product  Updated Successfully";
	}
	
	
	@DeleteMapping("/product/{id}")
	public String DeleteProduct(@PathVariable("id")int id) {
		ps.DeleteProduct(id);
		return "Product  Deleted Successfully";
	}


}
