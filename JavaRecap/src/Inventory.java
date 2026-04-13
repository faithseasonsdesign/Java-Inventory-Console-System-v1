

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Laptop> laptops = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

    public Inventory(){
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

    //
    //critical method kind of I guess
    public void addNewBook(Book book, ArrayList<Book> books, Inventory inventory, Scanner keyboard){

        //book variables
        String bookName = "";
        String authorName = "";
        int numberOfPages = 0;
        String isbnNumber = "";
        int bookPrice = 0;

        System.out.print("Enter book name : ");
        bookName = keyboard.nextLine();
        keyboard.nextLine();
        System.out.print("Enter author of the book :  ");
        authorName = keyboard.nextLine();
        System.out.print("Enter Number Of Pages : ");
        numberOfPages = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter ISBN Number of the book : ");
        isbnNumber = keyboard.nextLine();
        System.out.print("Enter Price Of The Book : ");
        bookPrice = keyboard.nextInt();

        //adding a book
        book.setBookName(bookName);
        book.setAuthorName(authorName);
        book.setNumberOfPages(numberOfPages);
        book.setISBNNumber(isbnNumber);
        book.setBookPrice(bookPrice);

        books.add(book);
        inventory.setBooks(books);

    }

    //adding a new laptop
    public void addNewLaptop(Laptop laptop, ArrayList<Laptop> laptops, Inventory inventory, Scanner keyboard){

        //laptop variables
        String laptopName = "";
        String laptopModel = "";
        int laptopPrice = 0;

        System.out.print("Enter Laptop Name : ");
        laptopName = keyboard.nextLine();
        keyboard.nextLine();
        System.out.print("Enter Laptop Model : ");
        laptopModel = keyboard.nextLine();
        System.out.print("Enter Laptop Price : ");
        laptopPrice = keyboard.nextInt();

        //adding a laptop
        laptop.setLaptopName(laptopName);
        laptop.setLaptopModel(laptopModel);
        laptop.setLaptopPrice(laptopPrice);

        laptops.add(laptop);
        inventory.setLaptops(laptops);

    }

    //adding a new car
    public void addNewCar(Car car, ArrayList<Car> cars, Inventory inventory, Scanner keyboard){

        //car variables
        String carName  = "";
        String carModel = "";
        int carPrice = 0;
        String carRegistrationNumber = "";

        System.out.print("Enter Car Name : ");
        carName = keyboard.nextLine();
        keyboard.nextLine();
        System.out.print("Enter Car Model : ");
        carModel = keyboard.nextLine();
        System.out.print("Enter Car Price : ");
        carPrice = keyboard.nextInt();
        System.out.print("Enter Car Registration Number : ");
        carRegistrationNumber = keyboard.nextLine();

        //add car information
        car.setCarName(carName);
        car.setCarModel(carModel);
        car.setCarPrice(carPrice);
        car.setCarRegistrationNumber(carRegistrationNumber);

        cars.add(car);
        inventory.setCars(cars);

    }

}