


public class Car{

    private String carName;
    private String carModel;
    private int carPrice;
    private String carRegistrationNumber;

    public Car(String carName,String carModel,int carPrice,String carRegistrationNumber){
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carRegistrationNumber = carRegistrationNumber;
    }

    //getter methods
    public void setCarName(String carName){
        this.carName = carName;
    }
    public void setCarModel(String carModel){
        this.carModel = carModel;
    }
    public void setCarPrice(int carPrice){
        this.carPrice = carPrice;
    }
    public void setCarRegistrationNumber(String carRegistrationNumber){
        this.carRegistrationNumber = carRegistrationNumber;
    }

    //setter methods
    public String getCarName(){
        return this.carName;
    }
    public String getCarModel(){
        return this.carModel;
    }
    public int getCarPrice(){
        return this.carPrice;
    }
    public String getCarRegistrationNumber(){
        return this.carRegistrationNumber;
    }

}
