package ua.goit.homework16;

public enum Products {
    A("A",1.25, 3, 3.0),
    B("B",4.25, null, null),
    C("C",1.0, 6, 5.0),
    D("D", 0.75, null, null);


    private final String strName;
    private final Double productPrice;
    private final Integer productStockCount;
    private final Double productStockPrice;

    Products(String strName, Double productPrice, Integer productStockCount, Double productStockPrice) {
        this.strName = strName;
        this.productPrice = productPrice;
        this.productStockCount = productStockCount;
        this.productStockPrice = productStockPrice;
    }

    public String getStrName() {
        return strName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getProductStockCount() {
        return productStockCount;
    }

    public Double getProductStockPrice() {
        return productStockPrice;
    }
}
