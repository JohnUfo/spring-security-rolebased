package uz.muydinovs.appsecurityfirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.muydinovs.appsecurityfirst.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
