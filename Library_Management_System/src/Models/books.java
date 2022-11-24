package Models;

public class books {
    public void books_format(){
        System.out.println("Book name      Author       ISBN    Published_Year");
    }
    public books(String book_name, String author, int isbn, int published_year) {
        Book_name = book_name;
        Author = author;
        this.isbn = isbn;
        this.published_year = published_year;
    }

    String Book_name;
   String Author;
   int isbn;
   int published_year;

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public books(int book_id) {
        this.book_id = book_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    int book_id;
}
