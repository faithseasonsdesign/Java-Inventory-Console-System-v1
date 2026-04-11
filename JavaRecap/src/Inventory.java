

import java.util.ArrayList;

public class Inventory{

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Laptop> laptops = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

    public Inventory(ArrayList<Book> books,ArrayList<Laptop> laptops,ArrayList<Car> cars){
        this.books = books;
        this.laptops = laptops;
        this.cars = cars;
    }

    //setters
    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }
    public void setLaptops(ArrayList<Laptop> laptops){
        this.laptops = laptops;
    }
    public void setCars(ArrayList<Car> cars){
        this.cars = cars;
    }

    //getters
    public ArrayList<Book> getBooks(){
        return this.books;
    }
    public ArrayList<Laptop> getLaptops(){
        return this.laptops;
    }
    public ArrayList<Car> getCars(){
        return this.cars;
    }

}