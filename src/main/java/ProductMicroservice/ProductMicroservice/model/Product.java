package ProductMicroservice.ProductMicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="producttbl")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private String field1;
	private String field2;
	private String field3;
	private float price;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "product_type_id",nullable = false)
	private Product_Type product_type;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "category_id",nullable = false)
	private Product_Category category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, String product_name, String field1, String field2, String field3, float price,
			Product_Type product_type, Product_Category category) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.price = price;
		this.product_type = product_type;
		this.category = category;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product_Type getProduct_type() {
		return product_type;
	}

	public void setProduct_type(Product_Type product_type) {
		this.product_type = product_type;
	}

	public Product_Category getCategory() {
		return category;
	}

	public void setCategory(Product_Category category) {
		this.category = category;
	}
	
	
	
	
	
	

}
