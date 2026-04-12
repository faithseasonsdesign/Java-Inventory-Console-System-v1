
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

                //adding a book
                book.setBookName(bookName);
                book.setAuthorName(authorName);
                book.setNumberOfPages(numberOfPages);
                book.setISBNNumber(isbnNumber);
                book.setBookPrice(bookPrice);

                books.add(book);
                inventory.setBooks(books);

                System.out.println("Would you like to continue adding books?");
                System.out.println("Enter 1 + Enter key if you would like to add more books.");
                System.out.println("Enter 5 + Enter key for the main menu.");
                option = keyboard.nextInt();

                if(option==5){
                    displayInformation();
                    option = keyboard.nextInt();
                }

            }
            else if(option==2){

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

                //prompting the user if they want to continue or not
                System.out.println("Would you like to continue adding laptops?");
                System.out.println("Enter 2 + Enter key if you would like to add more laptops.");
                System.out.println("Enter 5 + Enter key for the main menu.");
                option = keyboard.nextInt();

                if(option==5){
                    displayInformation();
                    option = keyboard.nextInt();
                }

            }
            else if(option==3){

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

                //prompting the user if they want to continue or not
                System.out.println("Would you like to continue adding laptops?");
                System.out.println("Enter 3 + Enter key if you would like to add more cars.");
                System.out.println("Enter 5 + Enter key for the main menu.");
                option = keyboard.nextInt();

                if(option==5){
                    displayInformation();
                    option = keyboard.nextInt();
                }

            }else{
                System.out.println("Invalid input");
            }

        }

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