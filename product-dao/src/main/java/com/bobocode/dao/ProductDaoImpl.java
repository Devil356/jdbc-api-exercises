package com.bobocode.dao;

import com.bobocode.model.Product;

import javax.sql.DataSource;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private DataSource dataSource;

    public ProductDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Product product) {
        throw new UnsupportedOperationException("None of these methods will work unless you implement them!");// todo
    }

    @Override
    public List<Product> findAll() {
        throw new UnsupportedOperationException("None of these methods will work unless you implement them!");// todo
    }

    @Override
    public Product findOne(Long id) {
        throw new UnsupportedOperationException("None of these methods will work unless you implement them!");// todo
    }

    @Override
    public void update(Product product) {
        throw new UnsupportedOperationException("None of these methods will work unless you implement them!");// todo
    }

    @Override
    public void remove(Product product) {
        throw new UnsupportedOperationException("None of these methods will work unless you implement them!");// todo
    }

}
