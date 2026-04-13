
import java.util.Scanner;
import java.util.ArrayList;

class JavaRecap{
    public static void main(String[] args){

        int loopBreak = 0;
        int option = 5;

        Scanner keyboard = new Scanner(System.in);

        Book book = new Book("","",0,"",0);
        Laptop laptop = new Laptop("","",0);
        Car car = new Car("","",20,"");

        Inventory inventory = new Inventory();

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        //storing information now.
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Laptop> laptopList = new ArrayList<>();
        ArrayList<Car> carsList = new ArrayList<>();

        displayInformation();
        option = keyboard.nextInt();

        //option for adding information
        while(option != loopBreak){

            if(option==1){

                inventory.addNewBook(book,books,inventory,keyboard);
                rePromptingUser("book",1);
                option = keyboard.nextInt();

                if(option==5){
                    displayInformation();
                    option = keyboard.nextInt();
                }

            }
            else if(option==2){

                inventory.addNewLaptop(laptop,laptops,inventory,keyboard);
                rePromptingUser("laptop",2);
                option = keyboard.nextInt();

                if(option==5){
                    displayInformation();
                    option = keyboard.nextInt();
                }

            }
            else if(option==3){

                inventory.addNewLaptop(laptop,laptops,inventory,keyboard);
                rePromptingUser("car",3);
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
                        inventory.addNewBook(book,books,inventory,keyboard);
                        rePromptingUser("book",1);
                        option = keyboard.nextInt();
                    }
                    if(option==5){
                        displayInformation();
                        option = keyboard.nextInt();
                    }
                }
                else{
                    viewProductPrompt("book");
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
                if(inventory.getLaptops().isEmpty()){
                    rePromptingUser("laptop",2);
                    option = keyboard.nextInt();
                    if(option==2){
                        inventory.addNewLaptop(laptop,laptops,inventory,keyboard);
                        rePromptingUser("laptop",2);
                        option = keyboard.nextInt();
                    }
                    if(option==5){
                        displayInformation();
                        option = keyboard.nextInt();
                    }
                }else{
                    viewProductPrompt("laptop");
                    option = keyboard.nextInt();
                    if(option==1){
                        laptopList = inventory.getLaptops();
                        //just view book 1 =>
                        if(laptopList.isEmpty()){
                            System.out.println("The laptop inventory is currently empty at the moment");
                            rePromptingUser("laptop",2);
                            option = keyboard.nextInt();

                        }else{
                            System.out.println("Here is the information of the first laptop : ");
                            System.out.println("Laptop Name : " + laptopList.getFirst().getLaptopName() + " Laptop Price : " + laptopList.getFirst().getLaptopPrice());
                            rePromptingUser("laptop",2);
                            option = keyboard.nextInt();
                        }
                    }
                }
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

    //function for reprompting user to enter information
    public static void rePromptingUser(String productName,int productNumber){
        System.out.println("Would you like to add a " + productName + " ? ");
        System.out.println("Enter " + productNumber + " Enter key if you would like to add a " + productName + "");
        System.out.println("Enter 5 + Enter key for the main menu.");
        System.out.println("Enter 0 + Enter key to exit the program");
    }
    public static void viewProductPrompt(String productName){
        System.out.println("Would you like to view which" + productName + " are in the inventory" );
        System.out.println("Press 1 + Enter key if yes : ");
        System.out.println("Press 2 + Enter key if no : ");
        System.out.println("Press 0 + Enter key if you want to exit the program");
    }
}