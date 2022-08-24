package ProductMicroservice.ProductMicroservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categorytbl")
public class Product_Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	private String category_name;
	
	@OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	private  List<Product_Type> product_type;

	public Product_Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product_Category(int category_id, String category_name, List<Product_Type> product_type) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.product_type = product_type;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public List<Product_Type> getProduct_type() {
		return product_type;
	}

	public void setProduct_type(List<Product_Type> product_type) {
		this.product_type = product_type;
	}

}
