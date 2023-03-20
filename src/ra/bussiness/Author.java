package ra.bussiness;

import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author(){
    }
    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Author Id ");
        this.setAuthorId(Integer.parseInt(input.nextLine()));
        System.out.print("Enter Author Name: ");
        setAuthorName(input.nextLine());
        System.out.print("Enter Author Sex: ");
        setSex(input.nextBoolean());
        System.out.print("Enter Author year of birth: ");
        setYear(input.nextInt());
    }

    @Override
    public void displayData() {
        System.out.println("Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName +"}");
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", sex=" + (sex? "Nam": "Nữ") +
                ", year=" + year +
                '}';
    }
}
