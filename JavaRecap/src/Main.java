
import java.util.Scanner;
import java.util.ArrayList;

class JavaRecap{
    public static void main(String[] args){

        int loopBreak = 0;
        int option = 5;

        Scanner keyboard = new Scanner(System.in);

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

        Inventory inventory = new Inventory();

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        //storing information now.
        ArrayList<Book> bookList = new ArrayList<>();

        displayInformation();
        option = keyboard.nextInt();

        //option for adding information
        while(option != loopBreak){

            if(option==1){

                addNewBook(book,books,inventory);
                rePromptingUser("book",1);
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

            }
            else if(option==4){
                System.out.println("Total number of books is : " + inventory.getBooks().size());
                if(inventory.getBooks().isEmpty()){
                    rePromptingUser("book",1);
                    option = keyboard.nextInt();
                    if(option==1){
                        addNewBook(book,books,inventory);
                        rePromptingUser("book",1);
                        option = keyboard.nextInt();
                    }else if(option==5){
                        displayInformation();
                        option = keyboard.nextInt();
                    }
                }else{
                    System.out.println("Would you like to view which books are in the inventory? ");
                    System.out.println("Press 1 + Enter key if yes : ");
                    System.out.println("Press 2 + Enter key if no : ");
                    System.out.println("Press 0 + Enter key if you want to exit the program");
                    option = keyboard.nextInt();
                    //get list of books
                    if(option==1){
                        bookList = inventory.getBooks();
                        //just view book 1 =>
                        if(bookList.isEmpty()){
                            System.out.println("The book inventory is currently empty at the moment");
                            rePromptingUser("book",1);
                            option = keyboard.nextInt();

                        }else{
                            System.out.println("Here is the information of the first book : ");
                            System.out.println("Book Name : " + bookList.getFirst().getBookName() + " Book Author : " + bookList.getFirst().getAuthorName());
                            rePromptingUser("book",1);
                            option = keyboard.nextInt();
                        }
                    }
                }
            }
            else if(option==5){
                System.out.println("Total number of laptops is : " + inventory.getLaptops().size());
            }
            else if(option==6){
                System.out.println("Total number of cars is : " + inventory.getCars().size());
            }
            else{
                System.out.println("Invalid input");
            }

        }

    }
    public static void displayInformation(){
        System.out.println("Welcome to Alibaba Store");
        System.out.println("What would you like to do to our inventory today?");
        System.out.println("Press 1 + enter key  if you want to add a book");
        System.out.println("Press 2 + enter key if you want to add a laptop");
        System.out.println("Press 3 + enter key if you want to add a car");
        System.out.println("Press 4 + enter key if you want to view Number of Books");
        System.out.println("Press 5 + enter key if you want to view number of laptops");
        System.out.println("Press 6 + enter key if you want to view number of cars");
        System.out.println("Press 0 + enter key if you want to cancel/exit the program");
    }
    public static void addNewBook(Book book, ArrayList<Book> books, Inventory inventory){

        Scanner keyboard = new Scanner(System.in);

        //book variables
        String bookName = "";
        String authorName = "";
        int numberOfPages = 0;
        String isbnNumber = "";
        int bookPrice = 0;

        System.out.print("Enter book name : ");
        bookName = keyboard.nextLine();
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
    //function for reprompting user to enter information
    public static void rePromptingUser(String productName,int productNumber){
        System.out.println("Would you like to add a " + productName + " ? ");
        System.out.println("Enter " + productNumber + " Enter key if you would like to add a " + productName + "");
        System.out.println("Enter 5 + Enter key for the main menu.");
        System.out.println("Enter 0 + Enter key to exit the program");
    }
}