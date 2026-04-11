
import java.util.Scanner;
import java.util.ArrayList;

class JavaRecap{
    public static void main(String[] args){

        int loopBreak = 0;
        int option = 5;

        Scanner keyboard = new Scanner(System.in);

        //book variables
        String bookName = "";
        String authorName = "";
        int numberOfPages = 0;
        String isbnNumber = "";
        int bookPrice = 0;

        //laptop variables
        String laptopName = "";
        String laptopModel = "";
        int laptopPrice = 0;

        //car variables
        String carName  = "";
        String carModel = "";
        int carPrice = 0;
        String carRegistrationNumber = "";

        Book book = new Book("","",0,"",0);
        Laptop laptop = new Laptop("","",0);
        Car car = new Car("","",20,"");

        Inventory inventory = new Inventory(new ArrayList<Book>(),new ArrayList<Laptop>(),new ArrayList<>());

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        displayInformation();
        option = keyboard.nextInt();

        //option for adding information
        while(option != loopBreak){

            if(option==1){
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

                //adding a book simply imitating user input here : if they were to add multiple books
                book.setBookName(bookName);
                book.setAuthorName(authorName);
                book.setNumberOfPages(numberOfPages);
                book.setISBNNumber(isbnNumber);
                book.setBookPrice(bookPrice);

                System.out.println("Would you like to continue adding books?");
                System.out.println("Enter 1 + Enter key if you would like to add more books.");
                System.out.println("Enter 5 + Enter key for the main menu.");
                option = keyboard.nextInt();

            }
            else if(option==2){
                System.out.println("We can now add laptops logic here");
            }
            else if(option==3){
                System.out.println("We can now add the cars logic here");
            }else{
                System.out.println("Invalid input");
            }

        }

        //adding a laptop here simply imitating user input here too
        laptop.setLaptopName("Mac-book Air");
        laptop.setLaptopModel("Mac18");
        laptop.setLaptopPrice(12000);

        //adding a car simply imitating user input here to : consider if they were to add multiple cars and the logic was complete
        car.setCarName("Porche");
        car.setCarModel("911");
        car.setCarPrice(2000000);
        car.setCarRegistrationNumber("1323DF");

        books.add(book);
        laptops.add(laptop);
        cars.add(car);

        inventory.setBooks(books);
        inventory.setLaptops(laptops);
        inventory.setCars(cars);

    }
    public static void displayInformation(){
        System.out.println("Welcome to Alibaba Store");
        System.out.println("What would you like to add to our inventory today?");
        System.out.println("Press 1 + enter key  if you want to add a book");
        System.out.println("Press 2 + enter key if you want to add a laptop");
        System.out.println("Press 3 + enter key if you want to add a car");
        System.out.println("Press 0 + enter key if you want to cancel/exit the program");
    }
}