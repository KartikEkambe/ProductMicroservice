package ProductMicroservice.ProductMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProductMicroservice.ProductMicroservice.model.Product;

public interface Product_Repository extends JpaRepository<Product, Integer> {

}
