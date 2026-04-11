


public class Laptop{

    private String laptopName;
    private String laptopModel;
    private int laptopPrice;

    //constructor
    public Laptop(String laptopName,String laptopModel,int laptopPrice){
        this.laptopName  = laptopName;
        this.laptopModel = laptopModel;
        this.laptopPrice = laptopPrice;
    }

    //setter methods
    public void setLaptopName(String laptopName){
        this.laptopName = laptopName;
    }
    public void setLaptopModel(String laptopModel){
        this.laptopModel = laptopModel;
    }
    public void setLaptopPrice(int laptopPrice){
        this.laptopPrice = laptopPrice;
    }

    //getter methods
    public String getLaptopName(){
        return this.laptopName;
    }
    public String getLaptopModel(){
        return this.laptopModel;
    }
    public int getLaptopPrice(){
        return this.laptopPrice;
    }

}