package encapsulation;

public class car {
    private String sn;
    private String model;
    private String manufc;
    private int year;
    private int price;
    
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getManufc() {
        return manufc;
    }
    public void setManufc(String manufc) {
        this.manufc = manufc;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
