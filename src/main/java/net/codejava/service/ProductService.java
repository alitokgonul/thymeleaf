package net.codejava.service;

import net.codejava.model.Product;
import net.codejava.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    @Autowired
    private ProductService service;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        Product p = service.get(id);
        repo.delete(p);
    }
}
