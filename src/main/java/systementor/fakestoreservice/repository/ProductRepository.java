package systementor.fakestoreservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import systementor.fakestoreservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
