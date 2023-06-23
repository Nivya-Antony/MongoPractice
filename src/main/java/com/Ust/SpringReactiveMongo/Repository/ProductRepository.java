package com.Ust.SpringReactiveMongo.Repository;

import com.Ust.SpringReactiveMongo.Entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
