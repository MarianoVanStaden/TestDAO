public class ModelProduct {
    private int id;
    private String code;
    private String productName;
    private String quantity;

    public ModelProduct(int id, String code, String productName, String quantity) {
        this.id = id;
        this.code = code;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }
}
