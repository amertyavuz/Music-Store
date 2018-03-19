package com.musicstore.dao;

import com.musicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product1 = new Product();
        product1.setProductId("P123");
        product1.setProductName("Gitar");
        product1.setProductCategory("Enstrüman");
        product1.setProductDescription("Gitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("yeni");
        product1.setProductStatus("var");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Ahmet");

        Product product2 = new Product();
        product2.setProductId("P124");
        product2.setProductName("Plak");
        product2.setProductCategory("Plak");
        product2.setProductDescription("19. yy. Plağı");
        product2.setProductPrice(25);
        product2.setProductCondition("yeni");
        product2.setProductStatus("var");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("Mert");

        Product product3 = new Product();
        product3.setProductId("P125");
        product3.setProductName("Hoparlör");
        product3.setProductCategory("Aksesuar");
        product3.setProductDescription("5+1 ses sistemi");
        product3.setProductPrice(355);
        product3.setProductCondition("yeni");
        product3.setProductStatus("var");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Yavuz");

        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for (Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
}
