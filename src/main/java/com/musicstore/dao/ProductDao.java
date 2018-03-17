package com.musicstore.dao;

import com.musicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product1 = new Product();

        product1.setProductName("Gitar");
        product1.setProductCategory("Enstrüman");
        product1.setProducDescription("Gitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("active");
        product1.setUnitInstock(11);
        product1.setProductManufacturer("Yavuz");

        productList=new ArrayList<Product>();
        productList.add(product1);

        return productList;

    }





}
