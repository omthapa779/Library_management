package Models;

public class borrowing {
    public borrowing(int book_id, int extra_days, int fine_rate) {
        this.book_id = book_id;
        this.extra_days = extra_days;
        this.fine_rate = fine_rate;
    }

    int book_id;
   int extra_days;
   int fine_rate;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getFine_rate() {
        return fine_rate;
    }

    public void setFine_rate(int fine_rate) {
        this.fine_rate = fine_rate;
    }
}
