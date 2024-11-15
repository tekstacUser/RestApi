package com.RestApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {

    public List<Product> productList = new ArrayList<Product>();

    // Default no-argument constructor
    public ProductResource() {
        Product p1 = new Product(1, "Mobile", 25000);
        Product p2 = new Product(2, "Fan", 1500);
        productList.addAll(Arrays.asList(p1, p2));
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> get() {
        return productList;
    }
}
