package Models;

public class students {
    public void Format(){
        System.out.println("Student Name       Class      Borrowed_Books");
    }
    public students(String student_name, int class_number, int no_of_books) {
        Student_name = student_name;
        this.class_number = class_number;
        this.no_of_books = no_of_books;
    }

    String Student_name;
    int class_number;
    int no_of_books;

    public students(int student_id) {
        this.student_id = student_id;
    }

    int student_id;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public int getNo_of_books() {
        return no_of_books;
    }

    public void setNo_of_books(int no_of_books) {
        this.no_of_books = no_of_books;
    }
}
