import java.util.ArrayList;
import java.util.Scanner;

public class Book{

    private String bookName;
    private String authorName;
    private int numberOfPages;
    private String isbnNumber;
    private int bookPrice;

    //constructor
    public Book(String bookName, String authorName, int numberOfPages, String isbnNumber , int bookPrice){
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.isbnNumber = isbnNumber;
        this.bookPrice = bookPrice;
    }

    //setters
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setISBNNumber(String isbNumber){
        this.isbnNumber = isbNumber;
    }
    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }

    //get methods
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    public String ISBNNumber(){
        return this.isbnNumber;
    }
    public int getBookPrice(){
        return this.bookPrice;
    }

}