package ProductMicroservice.ProductMicroservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="producttypetbl")
public class Product_Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_type_id;
	private String product_type_name;
	
	@ManyToOne(fetch = FetchType.LAZY,optional= false)
	@JoinColumn(name="category_id",nullable = false)
	private Product_Category category;
	
	@OneToMany(mappedBy = "product_type",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("product_type")
	private  List<Product> product;

	public Product_Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product_Type(int product_type_id, String product_type_name, Product_Category category,
			List<Product> product) {
		super();
		this.product_type_id = product_type_id;
		this.product_type_name = product_type_name;
		this.category = category;
		this.product = product;
	}

	public int getProduct_type_id() {
		return product_type_id;
	}

	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public Product_Category getCategory() {
		return category;
	}

	public void setCategory(Product_Category category) {
		this.category = category;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
