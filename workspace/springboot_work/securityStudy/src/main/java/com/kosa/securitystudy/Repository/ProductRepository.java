package com.kosa.securitystudy.Repository;


import com.kosa.securitystudy.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
