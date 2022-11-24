import Models.students;
import Models.books;
import Models.borrowing;
import java.util.Scanner;

public class main {
  public static void main(String[] args){
       students s1 = new students("Om Thapa",12,2);
       students s2 = new students("Safal Subedi",12,3);
       students s3 = new students("Riyaj Kuikel",12,1);
       students s4 = new students("Shubham Rimal",12,2);

       books b1 = new books("The Alchemist","Paulo Cohelo", 12111224, 2006);
       books b2 = new books("Mein Kampf","Adolf Hitler", 12126718, 1948);
       books b3 = new books("Theory of Everything","Stephen Hawking", 12212224, 2000);
       books b4 = new books("Harry Potter","JK Rowling", 12211214, 1998);

       borrowing bs1 = new borrowing(1,1,100);

       s1.Format();
       System.out.println("1. " + s1.getStudent_name() + "            " + s1.getClass_number() + "              " + s1.getNo_of_books());
       System.out.println("2. " +s2.getStudent_name() + "           " + s2.getClass_number() + "            " + s2.getNo_of_books());
       System.out.println("3. " +s3.getStudent_name() + "            " + s3.getClass_number() + "           " + s3.getNo_of_books());
       System.out.println("4. " +s4.getStudent_name() + "            " + s4.getClass_number() + "           " + s4.getNo_of_books());
       Scanner student_id = new Scanner(System.in);
       System.out.println("Select Your student id: ");
       int students = student_id.nextInt();

       if(students == 1){
            System.out.println("The student is " + s1.getStudent_name() + " of class " + s1.getClass_number() + " and has borrowed " + s1.getNo_of_books() + " books." );
       } else if (students == 2) {
            System.out.println("The student is " + s2.getStudent_name() + " of class " + s2.getClass_number() + " and has borrowed " + s2.getNo_of_books() + " books." );
       }else if (students == 3) {
            System.out.println("The student is " + s3.getStudent_name() + " of class " + s3.getClass_number() + " and has borrowed " + s3.getNo_of_books() + " books." );
       }
       else if (students == 4) {
            System.out.println("The student is " + s4.getStudent_name() + " of class " + s4.getClass_number() + " and has borrowed " + s4.getNo_of_books() + " books." );
       }
       else {
            System.out.println("student not available");
       }

       Scanner extra_days = new Scanner(System.in);
       System.out.println("No.of extra days: ");
       int extra = extra_days.nextInt();

       b1.books_format();
       System.out.println("1. " + b1.getBook_name() + "            " + b1.getAuthor() + "              " + b1.getIsbn() + "    " + b1.getPublished_year());
       System.out.println("2. " + b2.getBook_name() + "            " + b2.getAuthor() + "              " + b2.getIsbn() + "    " + b2.getPublished_year());
       System.out.println("3. " + b3.getBook_name() + "            " + b3.getAuthor() + "              " + b3.getIsbn() + "    " + b3.getPublished_year());
       System.out.println("4. " + b4.getBook_name() + "            " + b4.getAuthor() + "              " + b4.getIsbn() + "    " + b4.getPublished_year());

       Scanner book_id = new Scanner(System.in);
       System.out.println("Select Book");
       int book = book_id.nextInt();

       int total = extra * bs1.getFine_rate();
       System.out.println("The total fine for " + extra + " days is " + total);
  }
}
