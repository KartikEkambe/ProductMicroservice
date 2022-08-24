package ProductMicroservice.ProductMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProductMicroservice.ProductMicroservice.model.Product_Category;

public interface Product_Category_Repository extends JpaRepository<Product_Category, Integer> {

}
