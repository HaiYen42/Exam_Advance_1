package ra.run;

import ra.bussiness.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<Book> bookArray= new ArrayList<>();
        ArrayList<Author>authorArray= new ArrayList<>();
        int option;
        do {
            System.out.println("\n****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n"+
            "1. Nhập số tác giả và nhập thông tin các tác giả\n"+
            "2.Nhập số sách và nhập thông tin các sách \n"+
            "3.Sắp xếp sách theo giá xuất sách tăng dần\n "+
            "4. Tìm kiếm sách theo tên tác giả sách\n"+
            "5. Thoát");
            System.out.print("Vui lòng chọn 1 lựa chọn: ");
            option= input.nextInt();
            int size=0;
            int sizeBook=0;
            switch (option){
                case 1://Nhập số tác giả và thông tin tác giả
                    System.out.println("Enter number of author: ");
                    size= input.nextInt();
                    inputAuthorInfor(authorArray, size);
                    break;
                case 2: //Nhập số sách và thông tin các sách
                    System.out.print("Enter number of book ");
                    sizeBook= input.nextInt();
                    inputBookInfor(bookArray, sizeBook);
                    break;
                case 3:// Hiện thị sách theo giá tang dần
                    sortBook(bookArray);
                    printBook(bookArray);
                    break;
                case 4:// Tìm kiếm sách theo tên tác giả

                    break;
                case 5://Thoát
                    System.out.println("Bạn đã thoát khỏi chương trình ");
                    System.exit(0);
                    break;
            }

        }while (option !=5);

    }
    //Option 1: Nhập thông tin tác giả
    public static void inputAuthorInfor(ArrayList<Author> authorArray, int size){
        for (int i = 0; i < size; i++) {
            System.out.println("Enter information of author no. "+(i+1));
            authorArray.add(new Author());
            authorArray.get(i).inputData();
        }
    }
    //Option 2: Nhập số sách và thông tin các sách
    public static void inputBookInfor(ArrayList<Book>bookArray, int sizeBook ){
        for (int i = 0; i < sizeBook; i++) {
            bookArray.add(new Book());
            bookArray.get(i).inputData();
        }
    }
    //Hiển thị book
    public static void printBook(ArrayList<Book> bookArray){
        for (int i = 0; i < bookArray.size(); i++) {
            bookArray.get(i).displayData();
        }
    }
    //Option 3: Sắp xếp sách theo giá bán tăng
    public static void sortBook(ArrayList<Book> bookArray){
        Collections.sort(bookArray);

    }
    // Option 4: Tìm kiếm sách theo tên tác giả
    public static void SearchBook(ArrayList<Book> bookArray){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào tác giả bạn muốn tìm kiếm ");
        String authorSearch = input.nextLine();
        for (int i = 0; i < bookArray.size(); i++) {
            if (bookArray.get(i).getAuthor().equalsIgnoreCase(authorSearch)) {
                bookArray.get(i).displayData();
            }
        }
    }
}
