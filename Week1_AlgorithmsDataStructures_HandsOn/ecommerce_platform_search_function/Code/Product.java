package Week1_AlgorithmsDataStructures_HandsOn.ecommerce_platform_search_function.Code;

public class Product{

    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public String getCategory(){
        return category;
    }
}