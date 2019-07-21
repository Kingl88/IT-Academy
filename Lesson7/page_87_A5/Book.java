package by.it_academy.Lesson7._87_a_5;

import java.util.Objects;

public class Book {

    private static int idst = 1;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;
    private TypeOfBinding typeOfBinding;

    public Book(String title, String author, String publisher, int yearOfPublication, int numberOfPages, int price, TypeOfBinding typeOfBinding) {
        id = idst;
        idst++;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public boolean currentAuthor (String author){
        if(this.author.contains(author)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean currentPublisher (String publisher){
        if(this.publisher.contains(publisher)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean afterYearOfPublication (int yearOfPublication){
        if(this.yearOfPublication > yearOfPublication) {
            return true;
        } else {
            return false;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public TypeOfBinding getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(TypeOfBinding typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearOfPublication == book.yearOfPublication &&
                numberOfPages == book.numberOfPages &&
                price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher) &&
                typeOfBinding == book.typeOfBinding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publisher, yearOfPublication, numberOfPages, price, typeOfBinding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfBinding=" + typeOfBinding.getType() +
                '}';
    }
}
