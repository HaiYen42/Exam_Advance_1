package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Book implements IShop, Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private String author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private Boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, String author, float importPrice, float exportPrice, int quantity, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice() {
        this.exportPrice = importPrice*RATE;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter Book Id ");
        this.setBookId(Integer.parseInt(input.nextLine()));
//        setBookId(input.nextInt());
        System.out.print("Enter Book Name ");
        setBookName(input.nextLine());
        System.out.print("Enter Book Title ");
        setTitle(input.nextLine());
        System.out.print("Enter number of Page ");
        setNumberOfPages(input.nextInt());
        System.out.print("Enter import price ");
        setImportPrice(input.nextFloat());
        System.out.print("Enter quantity of Book ");
        setQuantity(input.nextInt());
        System.out.print("Enter book status ");
        setBookStatus(input.nextBoolean());
        setExportPrice();
        System.out.print("Export price is " + getExportPrice()+"\n");
        setExportPrice();
    }

    @Override
    public void displayData() {
        System.out.println(
                "Book{" +
                        "bookId=" + bookId +
                        ", bookName='" + bookName + '\'' +
                        ", title='" + title + '\'' +
                        ", numberOfPages=" + numberOfPages +
                        ", author='" + author + '\'' +
                        ", exportPrice=" + exportPrice +
                        ", quantity=" + quantity +
                        ", bookStatus=" + (bookStatus? "còn hàng" : "hết hàng") +
                        '}'
        );
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                ", bookStatus=" + bookStatus +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int temp = (int) (this.getExportPrice()-o.getExportPrice());
        return temp;
    }
}
