package cart;


public class Item {

    // Properties, also known as members
    // in programming, these are the variables for the class
    private String name;
    private String code;
    private Integer quantity = 0;
    private Float price = 0f;

    public Item(String code, String name){
        this.code = code;
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getQuality() {
        return quantity;
    }
    public void setQuality(Integer quantity) {
        this.quantity = quantity;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    public Float totalCost() {
        return this.price*this.quantity;
    }
    



}