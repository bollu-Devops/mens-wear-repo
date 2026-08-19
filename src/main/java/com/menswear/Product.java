package com.menswear;

public class Product {

    private String name;
    private String category;
    private String price;
    private String image;

    public Product(
            String name,
            String category,
            String price,
            String image) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
